package com.company;

public class Main {

    public static String database="stu";

    public static void main(String[] args) {
        TreeRoot treeroot =new TreeRoot("root");
        BulidTree bulidTree=new BulidTree();
        bulidTree.build(treeroot);
//        bulidTree.dis(treeroot.getScan());
        String[] s={"07"};
        String[] n={"stu3"};
        treeroot.deal(s,n);
    }
}
