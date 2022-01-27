package com.company;

import java.util.Scanner;

public class Main {

    public static String database = "stu";
    public static Storage service=new Storage();


    public static void main(String[] args) {
        TreeRoot treeroot = new TreeRoot("root");
        BulidTree bulidTree = new BulidTree();
        bulidTree.build(treeroot);
        String[] s = {"02", "22", "22", "24", "22"};
        String[] n = {"stu1", "1000", "info1", "name", "zhangsan"};
        treeroot.deal(s, n);
    }
}
