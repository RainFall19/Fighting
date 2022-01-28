package com.company;

import java.util.Scanner;

public class Main {

    //当前使用数据库
    public static String database = "stu";
    //数据存储服务
    public static Storage service=new Storage();


    public static void main(String[] args) {
        TreeRoot treeroot = new TreeRoot("root");
        BulidTree bulidTree = new BulidTree();
        bulidTree.build(treeroot);
        String[] s = {"08", "22", "22","24","22"};
        String[] n = {"stu1", "1001", "info1","name","1643077454609"};
        treeroot.deal(s, n);
    }
}
