package com.company;

import java.io.*;

public class DeleteAll {

    /***
     * 09 22
     * deleteall  表名,行键
     * 删除表中所有列族在指定行上的数据(不需要指定列族和列的名称) 
     */
    public void delete_all(String[] s){
        File file=new File("Database/"+Main.database+"/"+s[0]);
        //判断当前数据库中表存在，不存在退出
        if(!file.exists()){
            System.out.println("当前数据库中"+s[0]+"表不存在...");
            return;
        }
        try {
            File file1=new File("Database/"+Main.database+"/"+s[0]+"/data.txt");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file1));
            String read;
            String write="";
            //将表内数据按行读取出来进行匹配
            while ((read=bufferedReader.readLine())!=null){
                //第一次分割按  \t
                String[] readLine=read.split("\t");
                if(readLine[0].equals(s[1])){
                    read="";
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
}
