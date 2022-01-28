package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;

public class Put {


    public boolean put_new_data(String[] s, DataNode dataNode){
        File file=new File("/home/bai/untitled/"+Main.database+"/"+s[0]);
        if(!file.exists()){
            System.out.println("当前数据库中没有"+s[0]+"表...");
            return false;
        }
        try {
            BufferedReader br=new BufferedReader(new FileReader("/home/bai/untitled/"+Main.database+"/p.txt"));
            String readFile;
            while ((readFile=br.readLine())!=null){
                String[] readLine=readFile.split("\t");
                String[] readTable=readLine[0].split("：");
                if(readTable[1].equals(s[0])){
                    String[] readInfo=readLine[1].split("：");
                    int n=0;
                    for (int i=1;i<readInfo.length;++i){
                        if(readInfo[i].equals(s[2])){
                            n++;
                            break;
                        }
                    }
                    if(n==0){
                        System.out.println("此表没有"+s[2]+"列族...");
                        return false;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //放入列表中
        DataNode d1=dataNode;
        while (d1.getId()!=null){
            d1=d1.getNext();
        }
        dataNode.setTail(d1);
        d1.setTable(s[0]);
        d1.setId(s[1]);
        d1.setInfo(s[2]);
        d1.setKey(s[3]);
        d1.setVal(s[4]);
        long l;
        if(s.length<=5){
            l=System.currentTimeMillis();
        }else {
            l=Long.parseLong(s[5]);
        }
        d1.setTime(l);
        return true;
    }




    public void put_write(DataNode d){
        File file=new File("/home/bai/untitled/"+Main.database+"/"+d.getTable());
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("/home/bai/untitled/"+Main.database+"/"+d.getTable()+"/data.txt",true));
            while (d!=null){
                bw.write(d.getId()+"\t"+d.getInfo()+":"+d.getKey()+"=>"+d.getVal()+"\t"+d.getTime()+"\n");
                d=d.getNext();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
