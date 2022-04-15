package com.company;

import Cache.Cache;
import KeyWords.KeywordsTree;
import tokeniz.Tok;

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
        String[] s = {"00", "22","20","01","23","22","23","21","22","20","01","23","22","23","21"};
        String[] n = {"stu4", "info1"};
        treeroot.deal(s,n);
//        n[4]="xxx";
//        treeroot.deal(s,n);
//        for (int i=0;i<7;++i){
//            n[1]=String.valueOf(i+1);
//            treeroot.deal(s, n);
//        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        service.dis();
//        service.scan("121");
//        service.dis();
//        service.scan("1011");
//        service.scan("1011");
    }
}
