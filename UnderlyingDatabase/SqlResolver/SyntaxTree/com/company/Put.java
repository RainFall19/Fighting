package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.*;

public class Put {

    //02 22 22 24 22 22
    public boolean put_new_data(String[] s, DataNodeLink dataNode){
        File file=new File("Database/"+Main.database+"/"+s[0]);
        if(!file.exists()){
            System.out.println("当前数据库中没有"+s[0]+"表...");
            return false;
        }
        try {
            BufferedReader br=new BufferedReader(new FileReader("Database/"+Main.database+"/p.txt"));
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
        DataNodeLink d1=dataNode.getNext();
        while (d1.getData().getId()!=null){
            d1=d1.getNext();
        }
        dataNode.setTail(d1);
        d1.getData().setTable(s[0]);
        d1.getData().setId(s[1]);
        d1.getData().setInfo(s[2]);
        d1.getData().setKey(s[3]);
        d1.getData().setVal(s[4]);
        long l;
        if(s.length<=5){
            l=System.currentTimeMillis();
        }else {
            l=Long.parseLong(s[5]);
        }
        d1.getData().setTime(l);
        return true;
    }

    //02 22 24 22
    public boolean put_new_data_table(String[] s,DataNodeLink dataNode){
        try {
            BufferedReader br=new BufferedReader(new FileReader("Database/"+Main.database+"/p.txt"));
            String readFile;
            while ((readFile=br.readLine())!=null){
                String[] readLine=readFile.split("\t");
                String[] readTable=readLine[0].split("：");
                if(readTable[1].equals(Main.table)){
                    String[] readInfo=readLine[1].split("：");
                    int n=0;
                    for (int i=1;i<readInfo.length;++i){
                        if(readInfo[i].equals(s[1])){
                            n++;
                            break;
                        }
                    }
                    if(n==0){
                        System.out.println("此表没有"+s[1]+"列族...");
                        return false;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //放入列表中
        DataNodeLink d1=dataNode.getNext();
        while (d1.getData().getId()!=null){
            d1=d1.getNext();
        }
        dataNode.setTail(d1);
        d1.getData().setTable(Main.table);
        d1.getData().setId(s[0]);
        d1.getData().setInfo(s[1]);
        d1.getData().setKey(s[2]);
        d1.getData().setVal(s[3]);
        long l;
        if(s.length<=4){
            l=System.currentTimeMillis();
        }else {
            l=Long.parseLong(s[4]);
        }
        d1.getData().setTime(l);
        return true;
    }

    /***
     * 02 24 22
     * put 列族名 : 列名,单元格的值
     */
    public boolean put_new_data_info(String[] s,DataNodeLink dataNode){
        try {
            BufferedReader br=new BufferedReader(new FileReader("Database/"+Main.database+"/p.txt"));
            String readFile;
            while ((readFile=br.readLine())!=null){
                String[] readLine=readFile.split("\t");
                String[] readTable=readLine[0].split("：");
                if(readTable[1].equals(Main.table)){
                    String[] readInfo=readLine[1].split("：");
                    int n=0;
                    for (int i=1;i<readInfo.length;++i){
                        if(readInfo[i].equals(s[0])){
                            n++;
                            break;
                        }
                    }
                    if(n==0){
                        System.out.println("此表没有"+s[0]+"列族...");
                        return false;
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //放入列表中
        DataNodeLink d1=dataNode.getNext();
        while (d1.getData().getId()!=null){
            d1=d1.getNext();
        }
        dataNode.setTail(d1);
        d1.getData().setTable(Main.table);
        d1.getData().setId(String.valueOf(Main.service.getId()+1));
        Main.service.setId(Main.service.getId()+1);
        d1.getData().setInfo(s[0]);
        d1.getData().setKey(s[1]);
        d1.getData().setVal(s[2]);
        long l;
        if(s.length<=3){
            l=System.currentTimeMillis();
        }else {
            l=Long.parseLong(s[3]);
        }
        d1.getData().setTime(l);
        return true;
    }


    /***
     *02 24 20 21
     * put values{列族名 : 列名,单元格的值,列族名 : 列名,单元格的值,...}
     */
//    public boolean put_values(String[] s,DataNodeLink dataNode){
//        int x=s.length/3;
//        try {
//            BufferedReader br=new BufferedReader(new FileReader("Database/"+Main.database+"/p.txt"));
//            String readFile;
//            while ((readFile=br.readLine())!=null){
//                String[] readLine=readFile.split("\t");
//                String[] readTable=readLine[0].split("：");
//                if(readTable[1].equals(Main.table)){
//                    String[] readInfo=readLine[1].split("：");
//                    int n=0;
//                    for (int i=1;i<readInfo.length;++i){
//                        if(readInfo[i].equals(s[0])){
//                            n++;
//                            break;
//                        }
//                    }
//                    if(n==0){
//                        System.out.println("此表没有"+s[0]+"列族...");
//                        return false;
//                    }
//                }
//            }
//            br.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        //放入列表中
//        DataNodeLink d1=dataNode.getNext();
//        for (int i=0;i<x;++i){
//            while (d1.getData().getId()!=null){
//                d1=d1.getNext();
//            }
//            dataNode.setTail(d1);
//            d1.getData().setTable(Main.table);
//            d1.getData().setId(String.valueOf(Main.service.getId()+1));
//            Main.service.setId(Main.service.getId()+1);
//            d1.getData().setInfo(s[0]);
//            d1.getData().setKey(s[1]);
//            d1.getData().setVal(s[2]);
//            long l;
//            if(s.length<=5){
//                l=System.currentTimeMillis();
//            }else {
//                l=Long.parseLong(s[3]);
//            }
//            d1.getData().setTime(l);
//        }
//        return true;
//    }

    public void put_write(DataNodeLink d){
        File file=new File("Database/"+Main.database+"/"+d.getData().getTable());
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter("Database/"+Main.database+"/"+d.getData().getTable()+"/data.txt",true));
            while (d.getData().getId()!=null){
                bw.write(d.getData().getId()+"\t"+d.getData().getInfo()+":"+d.getData().getKey()+"=>"+d.getData().getVal()+"\t"+d.getData().getTime()+"\n");
                d=d.getNext();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
