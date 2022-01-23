package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Put {

    private DataNode dataNode=new DataNode();

    public void new_put(){
        DataNode dataNode1=dataNode;
        dataNode.setTime(0);
        for (int i=1;i<16;++i){
            dataNode1.setNext(new DataNode());
            dataNode1=dataNode1.getNext();
            dataNode1.setTime(i);
        }
    }

    public void dis(){
        DataNode d=dataNode;
        for (int i=0;i<16;++i) {
            System.out.println(d.getTime());
            d=d.getNext();
        }
    }

    public void put(String[] s){
        DataNode d1=dataNode;
        while (d1.getId()!=null){
            d1=d1.getNext();
        }
        d1.setTable(s[0]);
        d1.setId(s[1]);
        d1.setInfo(s[2]);
        d1.setKey(s[3]);
        d1.setVal(s[4]);
        long l;
        if(s[5]==null){
            l=System.currentTimeMillis();
        }else {
            l=Long.parseLong(s[5]);
        }
        d1.setTime(l);
        if(d1.getNext()==null){
            put_write(dataNode);
        }
    }



    public void put_write(DataNode d){
        File file=new File("/home/bai/untitled/"+Main.database+"/"+d.getTable());
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("/home/bai/untitled/"+Main.database+"/"+d.getTable()+"/data.txt",true));
            while (d!=null){
                bw.write(d.getInfo()+"\t"+d.getInfo()+":"+d.getKey()+"=>"+d.getVal()+"\t"+d.getTime());
                d=d.getNext();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
