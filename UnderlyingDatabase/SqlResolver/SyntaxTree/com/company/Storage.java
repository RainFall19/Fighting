package com.company;

import sun.misc.Lock;

//存储服务
public class Storage {
    private DataNodeLink write;
    private DataNodeLink read;
    private DataNodeLink t;
    private Put put=new Put();
    private DataNodeLink two_sever;
    private DataNodeLink three_sever;
    private DataNodeLink four_sever;
    private int two;
    private int three;
    private int four;
    private Read_Sever read_sever=new Read_Sever();



    public void dis(){
        DataNodeLink t1=two_sever;
        while (t1!=null){
            System.out.println(t1.getData().getId());
            t1=t1.getNext();
        }
    }

    public Storage(){
        new_write();
        new_read();
    }

    private void new_read_sever(int x){
        Read_Sever sever=read_sever;
        while (sever.getNext()!=null){
            sever= sever.getNext();
        }
        sever.setNext(new Read_Sever());
        switch (x){
            case 0:{
                sever.getNext().setData(two_sever);
                break;
            }
            case 1:{
                sever.getNext().setData(three_sever);
                break;
            }
            case 2:{
                sever.getNext().setData(four_sever);
                break;
            }
        }

    }

    private void new_write(){
        write=new DataNodeLink();
        write.setData(new DataNode());
        DataNodeLink dataNode1=write;
        for (int i=1;i<4;++i){
            dataNode1.setNext(new DataNodeLink());
            dataNode1.getNext().setData(new DataNode());
            dataNode1=dataNode1.getNext();
        }
    }

    private void new_read(){
        read=new DataNodeLink();
        read.setData(new DataNode());
        DataNodeLink dataNode1=read;
        for (int i=1;i<4;++i){
            dataNode1.setNext(new DataNodeLink());
            dataNode1.getNext().setData(new DataNode());
            dataNode1=dataNode1.getNext();
        }
    }

    public boolean put_new_data(String[] s){
        if(put.put_new_data(s,write)){

            write();
            return true;
        }else {
            return false;
        }
    }

    public boolean write(){
        if(write.getTail().getNext()==null){
            t=write;
            write=read;
            read=t;
            Thread thread=new Thread(){
                @Override
                public void run() {
                    DataNodeLink t1=read;
                    DataNode tt;
                    while (t1!=null){
                        DataNodeLink t2=read;
                        while (t2!=null){
                            if(t2!=null){
                                if((t2.getData().getId().compareTo(t1.getData().getId())>0)&&(t2.getData().getId().length()>t1.getData().getId().length())){
                                    tt=t2.getData();
                                    t2.setData(t1.getData());
                                    t1.setData(tt);
                                }
                            }
                            t2=t2.getNext();
                        }
                        t1=t1.getNext();
                    }
                    two_sever();
                }
            };
            thread.start();
            return true;
        }else {
            return false;
        }
    }

    public void two_sever(){
        if(two>=4){
            three_sever();
            two=0;
        }
        if(two==0){
            two_sever=read;
            two_sever.setTail(read.getTail());
            new_read_sever(0);
        }else {
            DataNodeLink t1;
            DataNodeLink nodeLink=new DataNodeLink();
            nodeLink.setNext(two_sever);
            int num=0;
            while (read!=null&&nodeLink.getNext()!=null){
                if((read.getData().getId().compareTo(nodeLink.getNext().getData().getId())<=0)&&(read.getData().getId().length()<nodeLink.getNext().getData().getId().length())){
                    DataNodeLink d=read;
                    read=read.getNext();
                    t1=nodeLink.getNext();
                    nodeLink.setNext(d);
                    d.setNext(t1);
                    if(num==0){
                    two_sever=nodeLink.getNext();
                    }
                }
                num++;
                nodeLink=nodeLink.getNext();
            }
            while (read!=null){
                nodeLink.setNext(read);
                read=read.getNext();
                nodeLink=nodeLink.getNext();
                two_sever.setTail(nodeLink);
            }
        }
        new_read();
        two++;
    }

    public void three_sever(){
        if(three>=4){
            four_sever();
            three=0;
        }
        if(three==0){
            three_sever=two_sever;
            three_sever.setTail(two_sever.getTail());
            new_read_sever(1);
        }else {
            DataNodeLink t1;
            DataNodeLink nodeLink=new DataNodeLink();
            nodeLink.setNext(three_sever);
            int num=0;
            while (two_sever!=null&&nodeLink.getNext()!=null){
                if((two_sever.getData().getId().compareTo(nodeLink.getNext().getData().getId())<=0&&(two_sever.getData().getId().length()<nodeLink.getNext().getData().getId().length()))){
                    DataNodeLink d=two_sever;
                    two_sever=two_sever.getNext();
                    t1=nodeLink.getNext();
                    nodeLink.setNext(d);
                    d.setNext(t1);
                    if(num==0){
                        three_sever=nodeLink.getNext();
                    }
                }
                num++;
                nodeLink=nodeLink.getNext();
            }
            while (two_sever!=null){
                nodeLink.setNext(two_sever);
                two_sever=two_sever.getNext();
                nodeLink=nodeLink.getNext();
                three_sever.setTail(nodeLink);
            }
        }
        three++;
    }

    public void four_sever(){
        if(four>=4){
            put.put_write(four_sever);
            four=0;
        }
        if(four==0){
            four_sever=three_sever;
            four_sever.setTail(three_sever.getTail());
            new_read_sever(2);
        }else {
            DataNodeLink t1;
            DataNodeLink nodeLink=new DataNodeLink();
            nodeLink.setNext(four_sever);
            int num=0;
            while (three_sever!=null&&nodeLink.getNext()!=null){
                if((three_sever.getData().getId().compareTo(nodeLink.getNext().getData().getId())<=0&&(three_sever.getData().getId().length()<nodeLink.getNext().getData().getId().length()))){
                    DataNodeLink d=three_sever;
                    three_sever=three_sever.getNext();
                    t1=nodeLink.getNext();
                    nodeLink.setNext(d);
                    d.setNext(t1);
                    if(num==0){
                        four_sever=nodeLink.getNext();
                    }
                }
                num++;
                nodeLink=nodeLink.getNext();
            }
            while (three_sever!=null){
                nodeLink.setNext(three_sever);
                three_sever=three_sever.getNext();
                nodeLink=nodeLink.getNext();
                four_sever.setTail(nodeLink);
            }
        }
        four++;
    }

    public void scan(String id){
        Read_Sever read=read_sever.getNext();
        while (read!=null){
            if(id.compareTo(read.getData().getData().getId())>=0 && id.compareTo(read.getData().getTail().getData().getId())<=0){
                DataNodeLink data=read.getData();
                while (data!=null){
                    if(data.getData().getId().equals(id)){
                        System.out.println("ID:"+data.getData().getId()+"\tinfo:"+data.getData().getInfo()
                        + "\t"+data.getData().getKey()+"="+ data.getData().getVal()+"\t时间:"+data.getData().getTime());
                    }
                    data=data.getNext();
                }
            }
            read=read.getNext();
        }
    }
}
