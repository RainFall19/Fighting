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
        String[] n = {"stu1", "1010", "info1","name","zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1009", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1008", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1007", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1006", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1005", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1004", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1003", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1002", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1001", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1012", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        n = new String[]{"stu1", "1011", "info1", "name", "zzz"};
        treeroot.deal(s, n);
        service.dis();
    }
}
