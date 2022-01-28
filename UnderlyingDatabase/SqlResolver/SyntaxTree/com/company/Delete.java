package com.company;

import java.io.*;

public class Delete {
    //删除列族内所有数据
    //08 22 22
    public void delete_info(String[] s){
        File file=new File("/home/bai/untitled/"+Main.database+"/"+s[0]);
        //判断当前数据库中表存在，不存在退出
        if(!file.exists()){
            System.out.println("当前数据库中"+s[0]+"表不存在...");
            return;
        }
        try {
            File file1=new File("/home/bai/untitled/"+Main.database+"/"+s[0]+"/data.txt");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file1));
            String read;
            String write="";
            //将表内数据按行读取出来进行匹配
            while ((read=bufferedReader.readLine())!=null){
                //第一次分割按  \t
                String[] readLine=read.split("\t");
                if(readLine[0].equals(s[1])){
                    //第二次分割  按“：”，结果0为列族 1位name=>数据
                    String[] readInfo=readLine[1].split(":");
                    if(readInfo[0].equals(s[2])){
                        read="";
                        System.out.println("删除成功...");
                    }
                }
                //修改后的数据进行拼接
                if(!read.equals("")){
                    write=write+read+"\n";
                }
            }
            bufferedReader.close();
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file1));
            //写入文件
            bufferedWriter.write(write);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    //删除列族下列的所有数据
    //08 22 22 24
    public void delete_info_lie(String[] s){
        File file=new File("/home/bai/untitled/"+Main.database+"/"+s[0]);
        //将表内数据按行读取出来进行匹配
        if(!file.exists()){
            System.out.println("当前数据库中"+s[0]+"表不存在...");
            return;
        }
        try {
            File file1=new File("/home/bai/untitled/"+Main.database+"/"+s[0]+"/data.txt");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file1));
            String read;
            String write="";
            while ((read=bufferedReader.readLine())!=null){
                //第一次分割按  \t
                String[] readLine=read.split("\t");
                if(readLine[0].equals(s[1])){
                    //第二次分割  按 ：，结果0为列族 1位name=>数据
                    String[] readInfo=readLine[1].split(":");
                    if(readInfo[0].equals(s[2])){
                        //第三次分割  按 =>，结果0为列，1为数据
                        String[] readLie=readInfo[1].split("=>");
                        if(readLie[0].equals(s[3])){
                            read="";
                            System.out.println("删除成功...");
                        }
                    }
                }
                //修改后文件进行拼接
                if(!read.equals("")){
                    write=write+read+"\n";
                }
            }
            bufferedReader.close();
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file1));
            //写入数据
            bufferedWriter.write(write);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //按时间删除列族下列的数据
    //08 22 22 24 22
    public void delete_info_time(String[] s){
        File file=new File("/home/bai/untitled/"+Main.database+"/"+s[0]);
        //将表内数据按行读取出来进行匹配
        if(!file.exists()){
            System.out.println("当前数据库中"+s[0]+"表不存在...");
            return;
        }
        try {
            File file1=new File("/home/bai/untitled/"+Main.database+"/"+s[0]+"/data.txt");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file1));
            String read;
            String write="";
            while ((read=bufferedReader.readLine())!=null){
                // 第一次分割按  \t
                String[] readLine=read.split("\t");
                if(readLine[0].equals(s[1])){
                    //第二次分割  按 ：，结果0为列族 1位name=>数据
                    String[] readInfo=readLine[1].split(":");
                    if(readInfo[0].equals(s[2])){
                        //第三次分割  按 =>，结果0为列，1为数据
                        String[] readLie=readInfo[1].split("=>");
                        if(readLie[0].equals(s[3])){
                            //将时间字符串转换为long进行匹配
                            if(Long.parseLong(readLine[2])<=Long.parseLong(s[4])){
                                read="";
                                System.out.println("删除成功...");
                            }
                        }
                    }
                }
                //修改后数据进行拼接
                if(!read.equals("")){
                    write=write+read+"\n";
                }
            }
            bufferedReader.close();
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file1));
            //写入数据
            bufferedWriter.write(write);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
