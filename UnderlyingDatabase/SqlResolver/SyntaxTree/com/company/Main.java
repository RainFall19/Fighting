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
        Tok tok=new Tok();
        String[] key=new String[3];
        key[0]="alter";
        key[1]="put";
        key[2]="scan";
        String[] unkey;
        key=tok.tokeizSqlkw("put stu1,1011,info1:name,zzz");
        unkey=tok.tokeizSqlunkw("put stu1,1011,info1:name,zzz");
        for (int i = 0; i < key.length; i++) {
            System.out.println(key[i]);
        }
        KeywordsTree keyword=new KeywordsTree();
        String key1[]=keyword.change(key);
//        for (int i = 0; i < key1.length; i++) {
//            System.out.println(key1[i]);
//        }
//        System.out.println(999);
//        System.out.println(14);
        for (int i = 0; i < unkey.length; i++) {
            System.out.println(unkey[i]);
        }
//        String[] s = {"03", "22", "20","23","21"};
//        String[] n = {"stu1", "info1", "info3"};
//        treeroot.deal(s,n);
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
