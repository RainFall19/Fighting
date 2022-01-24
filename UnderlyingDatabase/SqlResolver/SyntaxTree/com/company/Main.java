package com.company;

import java.util.Scanner;

public class Main {

    public static String database = "stu";

    public static void main(String[] args) {
        TreeRoot treeroot = new TreeRoot("root");
        BulidTree bulidTree = new BulidTree();
        bulidTree.build(treeroot);
//        bulidTree.dis(treeroot.getScan());
        String[] s = {"02", "22", "22", "24", "22"};
        String[] n = {"stu1", "1000", "info1", "name", "zhangsan"};
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while (x != 1) {
            n[0] = scanner.next();
            n[1] = scanner.next();
            n[2] = scanner.next();
            n[3] = scanner.next();
            n[4] = scanner.next();
            treeroot.deal(s, n);
            System.out.println("x:");
            x = scanner.nextInt();
        }
    }
}
