package com.company;

import java.io.*;

public class Count {

    /***
     * 15
     * count  表名
     * 统计表记录了多少行
     */
    public void count(String[] s){
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
            int a=0;
            //读取
            while ((read=bufferedReader.readLine())!=null){
                a++;
            }
            System.out.println("当前表共有:"+a+"行");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
