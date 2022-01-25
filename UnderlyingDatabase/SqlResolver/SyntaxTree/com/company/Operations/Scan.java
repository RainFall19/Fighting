package com.company.Operations;

import com.company.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//查询数据,有限制条件
public class Scan {
    /**
     * 查询前两行数据
     * scan 表名, {LIMIT => 2}
     * 14 22 20 04 23 21
     */
    public void scan_table_limit(String[] s) {
        //创建一个对象指向要查询的表文件夹
        File file = new File("/home/bai/untitled/" + Main.database + "/" + s[0]);
        int row = Integer.parseInt(s[1]);//将传进来的限制行的非关键字(String)转为Int整数
        int line = 0;
        BufferedReader br = null;
        String str = null;
        try {
            br = new BufferedReader(new FileReader(file.getAbsoluteFile()));//getAbsolutePath返回抽象路径名的绝对路径名字符串
            while ((str = br.readLine()) != null) {//读取的每一行不为空时
                System.out.println(str);
                ++line;
                // 读取前row行内容
                if (line >= row) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 查询指定行键之后的所有数据
     * scan  表名, {STARTROW => 行键}
     * 14 22 20 10 23 21
     */     //s[0]表名    s[1]行键
    public void scan_table_startRow(String[] s) {
        //创建一个对象指向要查询的表文件夹
        File file = new File("/home/bai/untitled/" + Main.database + "/" + s[0]);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            //读取每一行
            String str = reader.readLine();
            int i = 0;
//            String[] rowkeys = new String[1000];
//            rowkeys[i] = str.split(" ")[0];
//            for (i = 0; i < rowkeys.length; i++) {
//                System.out.println(rowkeys[i]);
//            }
            List<String> rowKeys = new ArrayList<String>();
            while (str != null) {
                //以空格分隔出行键
                rowKeys.add(str.split(" ")[0]);
                str = reader.readLine();
                if (s[1].equals(str.split(" ")[0])) {
                    System.out.println(str);
                    break;
                }
                i++;
            }
            /*for (i = 0; i < rowKeys.size(); i++) {
                System.out.println(rowKeys.get(i));
            }*/
            //遍历所有行键
//            for (String string : rowKeys) {
//
//                System.out.println(string);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 查询指定多个连续行键间的所有数据(查询结果不包含等于ENDROW的结果集)
     * scan  表名, {STARTROW => 行键,ENDROW => 行键}
     * 14 22 20 10 23 22 11 23 21
     */     //s[0]表名    s[1]开头行键    s[2]末尾行键
    public void scan_table_startRow_endRow(String[] s) {
        //创建一个对象指向要查询的表文件夹
        File file = new File("/home/bai/untitled/" + Main.database + "/" + s[0]);
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            //读取每一行
            String str = reader.readLine();
            int i = 0;
            List<String> rowKeys = new ArrayList<String>();
            while (str != null) {
                //以空格分隔出行键
                rowKeys.add(str.split(" ")[0]);
                str = reader.readLine();
                if (s[1].equals(str.split(" ")[0])) {
                    while (!s[2].equals(str.split(" ")[0])){
                        System.out.println(str);
                        rowKeys.add(str.split(" ")[0]);
                        str = reader.readLine();
                        if (s[2].equals(str.split(" ")[0])){
                            System.out.println(str);
                            break;
                        }
                    }
                    break;
                }
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}