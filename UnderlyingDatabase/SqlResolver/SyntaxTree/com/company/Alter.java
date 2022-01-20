package com.company;

import java.io.*;

public class Alter {
    public void alter_lie(String[] s){
        File file=new File("/home/bai/untitled/"+Main.database+"/p.txt");
        try {
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String read=null;
            String str="";
            while ((read=reader.readLine())!=null){
                String[] s1=read.split("\t");
                if (s1[0].equals("表名："+s[0])){
                    s1[1]=s1[1]+","+s[1];
                    for(int i=0;i<s1.length;++i){
                        if(s1[i].contains("修改时间：")){
                            s1[i]="修改时间："+System.currentTimeMillis();
                        }
                    }
                }
                String str1="";
                for (int i=0;i<s1.length;++i){
                    str1=str1+s1[i]+"\t";
                }
                str=str+str1+"\n";
            }
            File file1=new File("/home/bai/untitled/"+Main.database);
            BufferedWriter bw=new BufferedWriter(new FileWriter("/home/bai/untitled/"+Main.database+"/p.txt"));
            bw.write(str);
            reader.close();
            bw.close();
            System.out.println("增加成功...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


