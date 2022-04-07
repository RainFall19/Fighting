package com.company;

import Cache.Cache;

import java.util.Scanner;

public class Main {

    //当前使用数据库
    public static String database = "stu";
    //数据存储服务
    public static Storage service=new Storage();
    //cache
    public static Cache cache=new Cache(64);


    public static void main(String[] args) {
        TreeRoot treeroot = new TreeRoot("root");
        BulidTree bulidTree = new BulidTree();
        bulidTree.build(treeroot);
        String[] s = {"02", "22", "22","24","22"};
        String[] n = {"stu1", "1011", "info1","name","zzz"};
        for (int i=0;i<123;++i){
            n[1]=String.valueOf(i+1);
            treeroot.deal(s, n);
        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        service.dis();
        service.scan("121");
        service.scan("121");
    }
}
