package com.company;

import sun.misc.Lock;

import java.io.*;

//存储服务
public class Storage {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private DataNodeLink write = new DataNodeLink();

    public DataNodeLink getWrite() {
        return write;
    }

    public void setWrite(DataNodeLink write) {
        this.write = write;
    }


    private DataNodeLink read;
    private DataNodeLink t;
    private Put put = new Put();
    private DataNodeLink two_sever = new DataNodeLink();
    private DataNodeLink three_sever = new DataNodeLink();
    private DataNodeLink four_sever = new DataNodeLink();
    private int two;
    private int three;
    private int four;
    private Read_Sever read_sever = new Read_Sever();


    public void dis() {
        Read_Sever r = read_sever.getNext();
        while (r != null) {
            DataNodeLink node = r.getData().getNext();
            while (node != null) {
                System.out.println(node.getData().getId());
                node = node.getNext();
            }
            r = r.getNext();
        }
    }

    public Storage() {
        //创建写空间
        new_write();
        //创建读空间
        new_read();
        //创建读服务
        new_read_sever();
        //读取最大id号
        read_id();
    }

    //将内存中的数据连接起来
    private void new_read_sever() {
        read_sever.setNext(new Read_Sever());
        read_sever.getNext().setData(write);
        read_sever.getNext().setNext(new Read_Sever());
        read_sever.getNext().getNext().setData(two_sever);
        read_sever.getNext().getNext().setNext(new Read_Sever());
        read_sever.getNext().getNext().getNext().setData(three_sever);
        read_sever.getNext().getNext().getNext().setNext(new Read_Sever());
        read_sever.getNext().getNext().getNext().getNext().setData(four_sever);
    }

    private void new_write() {
        DataNodeLink dataNode1 = write;
        for (int i = 0; i < 4; ++i) {
            dataNode1.setNext(new DataNodeLink());
            dataNode1.getNext().setData(new DataNode());
            dataNode1 = dataNode1.getNext();
        }
    }

    private void new_read() {
        read = new DataNodeLink();
        read.setData(new DataNode());
        DataNodeLink dataNode1 = read;
        for (int i = 1; i < 4; ++i) {
            dataNode1.setNext(new DataNodeLink());
            dataNode1.getNext().setData(new DataNode());
            dataNode1 = dataNode1.getNext();
        }
    }

    public boolean put_new_data(String[] s, int x) {
        boolean b=false;
        if(x==0){
            b=put.put_new_data(s, write);
        }
        else if(x==1){
            b=put.put_new_data_table(s, write);
        }
        else if(x==2){
            b=put.put_new_data_info(s,write);
        }else if(x==3){
            int n=s.length/3;
            for (int i = 0; i < n; i++) {
                b=put.put_new_data_info(new String[]{s[i*3],s[i*3+1],s[i*3+2]},write);
            }
        }
        if(b){
            write();
            return true;
        }
        return false;
    }

    public boolean write() {
        //如果write的尾部的下一个是空，则写入read
        if (write.getTail().getNext() == null) {
            t = write.getNext();
            write.setNext(read);
            read = t;
            read.setTail(write.getTail());
            Thread thread = new Thread() {
                @Override
                public void run() {
                    DataNodeLink t1 = read;
                    DataNode tt;
                    while (t1 != null) {
                        DataNodeLink t2 = t1.getNext();
                        while (t2 != null) {
                            if (t2 != null) {
                                if ((t2.getData().getId().length() < t1.getData().getId().length()) || ((t2.getData().getId().compareTo(t1.getData().getId()) < 0) && (t2.getData().getId().length() < t1.getData().getId().length()))) {
                                    tt = t2.getData();
                                    t2.setData(t1.getData());
                                    t1.setData(tt);
                                }
                            }
                            t2 = t2.getNext();
                        }
                        t1 = t1.getNext();
                    }
                    two_sever();
                }
            };
            thread.start();
            return true;
        } else {
            return false;
        }
    }

    public void two_sever() {
        //第二层满写入第三层
        if (two >= 4) {
            three_sever();
            two = 0;
        }
        //第二层空
        if (two == 0) {
            two_sever.setNext(read);
            two_sever.setTail(read.getTail());
        } else {
            DataNodeLink t1;
            DataNodeLink nodeLink = new DataNodeLink();
            nodeLink.setNext(two_sever.getNext());
            int num = 0;
            while (read != null && nodeLink.getNext() != null) {
                if ((read.getData().getId().length() < nodeLink.getNext().getData().getId().length()) ||
                        ((read.getData().getId().compareTo(nodeLink.getNext().getData().getId()) < 0) &&
                                (read.getData().getId().length() < nodeLink.getNext().getData().getId().length()))) {
                    DataNodeLink d = read;
                    read = read.getNext();
                    t1 = nodeLink.getNext();
                    nodeLink.setNext(d);
                    d.setNext(t1);
                    if (num == 0) {
                        two_sever.setNext(nodeLink.getNext());
                    }
                }
                num++;
                nodeLink = nodeLink.getNext();
            }
            while (read != null) {
                nodeLink.setNext(read);
                read = read.getNext();
                nodeLink = nodeLink.getNext();
                two_sever.setTail(nodeLink);
            }
        }
        new_read();
        two++;
    }

    public void three_sever() {
        if (three >= 4) {
            four_sever();
            three = 0;
        }
        if (three == 0) {
            three_sever.setNext(two_sever.getNext());
            three_sever.setTail(two_sever.getTail());
        } else {
            DataNodeLink t1;
            DataNodeLink nodeLink = new DataNodeLink();
            nodeLink.setNext(three_sever.getNext());
            int num = 0;
            while (two_sever.getNext() != null && nodeLink.getNext() != null) {
                if ((two_sever.getNext().getData().getId().length() < nodeLink.getNext().getData().getId().length()) ||
                        (two_sever.getNext().getData().getId().compareTo(nodeLink.getNext().getData().getId()) <= 0 &&
                                (two_sever.getNext().getData().getId().length() < nodeLink.getNext().getData().getId().length()))) {
                    DataNodeLink d = two_sever.getNext();
                    two_sever.setNext(two_sever.getNext().getNext());
                    t1 = nodeLink.getNext();
                    nodeLink.setNext(d);
                    d.setNext(t1);
                    if (num == 0) {
                        three_sever.setNext(nodeLink.getNext());
                    }
                }
                num++;
                nodeLink = nodeLink.getNext();
            }
            while (two_sever.getNext() != null) {
                nodeLink.setNext(two_sever.getNext());
                two_sever.setNext(two_sever.getNext().getNext());
                nodeLink = nodeLink.getNext();
                three_sever.setTail(nodeLink);
            }
        }
        three++;
    }

    public void four_sever() {
        if (four >= 4) {
            put.put_write(four_sever.getNext());
            four = 0;
        }
        if (four == 0) {
            four_sever.setNext(three_sever.getNext());
            four_sever.setTail(three_sever.getTail());
        } else {
            DataNodeLink t1;
            DataNodeLink nodeLink = new DataNodeLink();
            nodeLink.setNext(four_sever.getNext());
            int num = 0;
            while (three_sever.getNext() != null && nodeLink.getNext() != null) {
                if (three_sever.getNext().getData().getId().length() < nodeLink.getNext().getData().getId().length() ||
                        (three_sever.getNext().getData().getId().compareTo(nodeLink.getNext().getData().getId()) <= 0 &&
                                (three_sever.getNext().getData().getId().length() < nodeLink.getNext().getData().getId().length()))) {
                    DataNodeLink d = three_sever.getNext();
                    three_sever.setNext(three_sever.getNext().getNext());
                    t1 = nodeLink.getNext();
                    nodeLink.setNext(d);
                    d.setNext(t1);
                    if (num == 0) {
                        four_sever.setNext(nodeLink.getNext());
                    }
                }
                num++;
                nodeLink = nodeLink.getNext();
            }
            while (three_sever.getNext() != null) {
                nodeLink.setNext(three_sever.getNext());
                three_sever.setNext(three_sever.getNext().getNext());
                nodeLink = nodeLink.getNext();
                four_sever.setTail(nodeLink);
            }
        }
        four++;
    }

    public void scan(String id) {
        if (Main.cache.cache_read(id)) {
            return;
        }
        Read_Sever read = read_sever.getNext();
        while (read != null) {
            if (read.getData().getNext() != null && read.getData().getNext().getData().getId() != null) {
                if ((id.compareTo(read.getData().getNext().getData().getId()) >= 0) && (id.length() >= read.getData().getNext().getData().getId().length())
                        && (id.compareTo(read.getData().getTail().getData().getId()) <= 0) || (id.length() < read.getData().getTail().getData().getId().length())) {
                    DataNodeLink data = read.getData().getNext();
                    while (data != null && data.getData().getId() != null) {
                        if (data.getData().getId().equals(id)) {
                            System.out.println("ID:" + data.getData().getId() + "\tinfo:" + data.getData().getInfo()
                                    + "\t" + data.getData().getKey() + "=" + data.getData().getVal() + "\t时间:" + data.getData().getTime() + "\tscan");
                            Main.cache.cache_write(data.getData());
                        }
                        data = data.getNext();
                    }
                }
            }
            read = read.getNext();
        }
    }


    //将内存中所以数据写入文件
    public void write_now() {
        Read_Sever sever = read_sever.getNext();
        while (sever.getData().getNext() != null) {
            put.put_write(sever.getData().getNext());
            sever = sever.getNext();
        }
    }


    public void read_id() {
        File file = new File("Database/" + Main.database + "/" + Main.table + "/data.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String read = null;
            String str = "0";
            //一次读取一行数据
            while ((read = reader.readLine()) != null) {
                //进行分割
                String[] s1 = read.split("\t");
                //如果表名相同进入下一步
                if(Integer.valueOf(str)<Integer.valueOf(s1[0])){
                    str=s1[0];
                }
            }
            id=Integer.valueOf(str);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
