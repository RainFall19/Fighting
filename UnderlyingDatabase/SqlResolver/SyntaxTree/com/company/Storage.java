package com.company;

//存储服务
public class Storage {
    private DataNode write=new DataNode();
    private DataNode read=new DataNode();
    private DataNode t;
    private Put put=new Put();

    public Storage(){
        new_write();
        new_read();
    }

    public void new_write(){
        DataNode dataNode1=write;
        for (int i=1;i<16;++i){
            dataNode1.setNext(new DataNode());
            dataNode1=dataNode1.getNext();
        }
    }
    public void new_read(){
        DataNode dataNode1=read;
        for (int i=1;i<16;++i){
            dataNode1.setNext(new DataNode());
            dataNode1=dataNode1.getNext();
        }
    }

    public boolean put_new_data(String[] s){
        if(put.put_new_data(s,write)){
            t();
            return true;
        }else {
            return false;
        }
    }

    public boolean t(){
        if(write.getTail().getNext()==null){
            t=write;
            write=read;
            read=t;
            Thread thread=new Thread(){
                @Override
                public void run() {
                    put.put_write(read);
                }
            };
            thread.start();
            return true;
        }else {
            return false;
        }
    }

}
