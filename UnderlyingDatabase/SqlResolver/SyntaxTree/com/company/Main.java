package com.company;

import Cache.Cache;
import KeyWords.KeywordsTree;
import tokeniz.Tok;

import java.util.Scanner;

public class Main {

    //当前使用数据库
    public static String database = "stu";
    //当前使用表
    public static String table="stu1";
    //数据存储服务
    public static Storage service=new Storage();
    //cache
    public static Cache cache=new Cache(64);


    public static void main(String[] args) {
        TreeRoot treeroot = new TreeRoot("root");
        BulidTree bulidTree = new BulidTree();
        bulidTree.build(treeroot);
        String[] s = {"15"};
        String[] n = {"stu1"};
//        Tok tok=new Tok();
//        Scanner scanner=new Scanner(System.in);
//        String sql=scanner.nextLine();
//        String[] s=tok.tokeizSqlkw(sql);
//        String[] n=tok.tokeizSqlunkw(sql);
//        for (int i=0;i<s.length;++i){
//            System.out.println(s[i]);
//        }
//        for (int i=0;i<n.length;++i){
//            System.out.println(n[i]);
//        }
//        KeywordsTree keywordsTree=new KeywordsTree();
//        String[] x=keywordsTree.change(s);
//        for (int i=0;i<x.length;++i){
//            System.out.println(x[i]);
//        }
//        while (true){
//            System.out.println(database+":");
//
//        }
        treeroot.deal(s,n);
//        service.write_now();
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
