package com.company;

public class Main {


    public static void main(String[] args) {
	    TreeRoot treeroot =new TreeRoot("root");
        BulidTree bulidTree=new BulidTree();
        bulidTree.build(treeroot);
//        bulidTree.dis(treeroot.getScan());
        String[] s={"00","22","20","01","23","21","22","20","01","23","22"};
        treeroot.deal(s);
    }
}
