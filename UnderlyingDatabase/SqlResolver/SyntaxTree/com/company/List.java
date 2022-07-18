package com.company;

import java.io.*;

public class List {
    //查看当前库中的所有表
    //07
    public void list(){
        File file=new File("Database/"+Main.database+"/p.txt");
        try {
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String s;
            System.out.println("此库存在表：");
            int n=0;
            while ((s=bufferedReader.readLine())!=null){
                n++;
                String[] s1=s.split("\t");
                String[] s2=s1[0].split("：");
                System.out.println(s2[1]);
            }
            if(n==0){
                System.out.println("当前数据库没有表...");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
