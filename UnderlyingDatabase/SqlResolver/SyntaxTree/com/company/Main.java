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
        String[] s = {"02", "22", "22","24","22"};
        String[] n = {"stu1", "1011", "info1","name","zzz"};
        for (int i=0;i<84;++i){
            n[1]=String.valueOf(i+1);
            treeroot.deal(s, n);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.dis();
    }
}
