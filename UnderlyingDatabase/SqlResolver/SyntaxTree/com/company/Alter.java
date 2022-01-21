package com.company;

import java.io.*;

public class Alter {
    //增加列族
    //03 22
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

    //修改数据库名
    //03 25
    public void alter_database(String[] s){
        File oldName =new File("/home/bai/untitled/"+s[0]);
        File newName=new File("/home/bai/untitled/"+s[1]);
        if(!newName.exists()){
            if (oldName.renameTo(newName)){
                if (Main.database.equals(s[0])){
                    Main.database=s[1];
                }
                System.out.println("更改成功...");
            }else {
                System.out.println("更改失败...");
            }
        }else {
            System.out.println("当前数据库名称已存在，请修改...");
        }
    }

    //删除列族名
    //03 22 08 23
    public void alter_delete(String[] s){
        File file=new File("/home/bai/untitled/"+Main.database+"/p.txt");
        try {
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String read=null;
            String str="";
            while ((read=reader.readLine())!=null){
                String[] s1=read.split("\t");
                if (s1[0].equals("表名："+s[0])){
                    String[] s2=s1[1].split(",");
                    for (int i=0;i<s2.length;++i){
                        if(i==0){
                            if(s2[0].contains(s[1])){
                                s2[0]="列族：";
                                break;
                            }
                        }else {
                            if(s2[i].equals(s[1])){
                                s2[i]="";
                                break;
                            }
                        }
                    }
                    s1[1]="";
                    for (int i = 0; i<s2.length; ++i){
                        s1[1]=s1[1]+s2[i];
                    }
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
            System.out.println("删除成功...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //
    //03 22 20 01 23 21



}


