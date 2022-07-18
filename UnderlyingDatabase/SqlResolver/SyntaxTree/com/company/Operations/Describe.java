package com.company.Operations;

import com.company.Main;

import java.io.*;

public class Describe {
    /**
     * 查看指定表的列族信息
     * （查看表的详细结构，包括有多少个列族、每个列族的参数信息等
     * describe  表名
     * 17
     */ //传进来的是非关键字数组
    public void describe_tableCF(String[] s) {
        //创建一个对象指向当前表的元数据文件
        File file = new File("Database/" + Main.database + "/" + s[0] + "/p.txt");

        //表文件夹存在
        try {
            // 从文件系统中的某个文件中获取字节
//                FileInputStream fis=new FileInputStream("/home/bai/untitled/" + Main.database + "/" + "/p.txt");
            InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");//InputStreamReader 是字节流通向字符流的桥梁
            BufferedReader br = new BufferedReader(isr);// 从字符输入流中读取文件中的内容,封装了一个new InputStreamReader的对象

            // 按行读取字符串
            String str = "";
            String str1 = "";
            while ((str = br.readLine()) != null) {
                str1 += str + "\n";
            }
            // 当读取的一行不为空时,把读到的str的值赋给str1
            System.out.println(str1);// 打印出str1

            // 关闭的时候最好按照先后顺序关闭,最后开的先关闭
            br.close();
            isr.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
        } catch (IOException e) {
            System.out.println("读取文件失败");
            e.printStackTrace();
        }
    }
}