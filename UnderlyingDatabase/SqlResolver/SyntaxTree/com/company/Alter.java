package com.company;

import java.io.*;

public class Alter {
    //增加列族
    //03 22
    public void alter_lie(String[] s){
        //打开数据库配置文件
        File file=new File("/home/bai/untitled/"+Main.database+"/p.txt");
        try {
            //创建读出buffer
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String read=null;
            String str="";
            while ((read=reader.readLine())!=null){
                String[] s1=read.split("\t");
                //当表名匹配时进入下一步
                //列如：s1[0]=表名：stu      s[0]=stu
                if (s1[0].equals("表名："+s[0])){
                    //添加列族
                    s1[1]=s1[1]+","+s[1];
                    //找到修改时间列，将修改时间更新
                    for(int i=0;i<s1.length;++i){
                        if(s1[i].contains("修改时间：")){
                            s1[i]="修改时间："+System.currentTimeMillis();
                        }
                    }
                }
                //将修改完的字符串拼接
                String str1="";
                for (int i=0;i<s1.length;++i){
                    str1=str1+s1[i]+"\t";
                }
                str=str+str1+"\n";
            }
            //打开写入配置文件将修改信息写入
            File file1=new File("/home/bai/untitled/"+Main.database);
            BufferedWriter bw=new BufferedWriter(new FileWriter("/home/bai/untitled/"+Main.database+"/p.txt"));
            bw.write(str);
            //关闭文件
            reader.close();
            bw.close();
            //告诉添加成功
            System.out.println("增加成功...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //修改数据库名
    //03 25
    public void alter_database(String[] s){
        //打开一个新文件一个就文件
        File oldName =new File("/home/bai/untitled/"+s[0]);
        File newName=new File("/home/bai/untitled/"+s[1]);
        //如果新文件名存在就不允许修改，不存在进入下一步
        if(!newName.exists()){
            //将旧文件名改为新文件名
            if (oldName.renameTo(newName)){
                //如果当前使用数据库为更改数据库，就将当前数据库改为新名称
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
        //打开文件
        File file=new File("/home/bai/untitled/"+Main.database+"/p.txt");
        try {
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String read=null;
            String str="";
            //一次读取一行数据
            while ((read=reader.readLine())!=null){
                //进行分割
                String[] s1=read.split("\t");
                //如果表名相同进入下一步
                if (s1[0].equals("表名："+s[0])){
                    String[] s2=s1[1].split(",");
                    //分割后进行删除
                    for (int i=0;i<s2.length;++i){
                        //如果删除列族在第一个进行模糊匹配
                        if(i==0){
                            //模糊匹配
                            if(s2[0].contains(s[1])){
                                s2[0]="列族：";
                                break;
                            }
                        }else {
                            //正常匹配
                            if(s2[i].equals(s[1])){
                                s2[i]="";
                                break;
                            }
                        }
                    }
                    s1[1]="";
                    //拼接修改后字符串
                    for (int i = 0; i<s2.length; ++i){
                        s1[1]=s1[1]+s2[i];
                    }
                    //修改时间
                    for(int i=0;i<s1.length;++i){
                        if(s1[i].contains("修改时间：")){
                            s1[i]="修改时间："+System.currentTimeMillis();
                        }
                    }
                }
                //拼接总体字符串
                String str1="";
                for (int i=0;i<s1.length;++i){
                    str1=str1+s1[i]+"\t";
                }
                str=str+str1+"\n";
            }
            //写入数据
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


    //修改列族名
    //03 22 20 23 21
    public void alter_info(String[] s){
        //打开文件
        File file=new File("/home/bai/untitled/"+Main.database+"/p.txt");
        try {
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String read=null;
            String str="";
            //一次读取一行数据
            while ((read=reader.readLine())!=null){
                //进行分割
                String[] s1=read.split("\t");
                //如果表名相同进入下一步
                if (s1[0].equals("表名："+s[0])){
                    String[] s2=s1[1].split(",");
                    //分割后进行修改
                    for (int i=0;i<s2.length;++i){
                        //如果修改列族在第一个进行模糊匹配
                        if(i==0){
                            //模糊匹配
                            if(s2[0].contains(s[1])){
                                s2[0]="列族："+s[2];
                                break;
                            }
                        }else {
                            //正常匹配
                            if(s2[i].equals(s[1])){
                                s2[i]=s[2];
                                break;
                            }
                        }
                    }
                    s1[1]="";
                    //拼接修改后字符串
                    for (int i = 0; i<s2.length; ++i){
                        s1[1]=s1[1]+s2[i];
                    }
                    //修改时间
                    for(int i=0;i<s1.length;++i){
                        if(s1[i].contains("修改时间：")){
                            s1[i]="修改时间："+System.currentTimeMillis();
                        }
                    }
                }
                //拼接总体字符串
                String str1="";
                for (int i=0;i<s1.length;++i){
                    str1=str1+s1[i]+"\t";
                }
                str=str+str1+"\n";
            }
            //写入数据
            File file1=new File("/home/bai/untitled/"+Main.database);
            BufferedWriter bw=new BufferedWriter(new FileWriter("/home/bai/untitled/"+Main.database+"/p.txt"));
            bw.write(str);
            reader.close();
            bw.close();
            System.out.println("修改成功...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


