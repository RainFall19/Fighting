package com.company;

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

    public void new_write(){
        write=new DataNodeLink();
        write.setData(new DataNode());
        DataNodeLink dataNode1=write;
        for (int i=1;i<4;++i){
            dataNode1.setNext(new DataNodeLink());
            dataNode1.getNext().setData(new DataNode());
            dataNode1=dataNode1.getNext();
        }
    }
    public void new_read(){
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
                    DataNode tt=new DataNode();
                    while (t1!=null){
                        DataNodeLink t2=read;
                        while (t2!=null){
                            if(t2.getNext()!=null){
                                if(t2.getData().getId().compareTo(t2.getNext().getData().getId())>0){
                                    tt= t2.getData();
                                    t2.setData(t1.getNext().getData());
                                    t1.getNext().setData(tt);
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
        if(two>=3){
            ;
        }
        if(two==0){
            two_sever=read;
            two_sever.setTail(read.getTail());
        }else {
//            DataNodeLink t1;
//            DataNodeLink nodeLink=two_sever;
//            while (nodeLink.getNext()!=null){
//                if(read.getData().getId().compareTo(nodeLink.getNext().getData().getId())<0){
//                    t1=nodeLink;
//                    DataNodeLink d=read;
//                    nodeLink.setNext(d);
//                    read=read.getNext();
//                    d.setNext(t1);
//                }
//                nodeLink=nodeLink.getNext();
//            }
//            while (read!=null){
//                nodeLink.setNext(read);
//                read=read.getNext();
//                nodeLink=nodeLink.getNext();
//            }
//            two_sever.setTail(nodeLink);
        }
        new_read();
        two++;
    }

}
