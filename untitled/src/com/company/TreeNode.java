package com.company;

public class TreeNode {
    private String id;
    private TreeNode l_child;
    private TreeNode r_child;

    public void deal_with(){
        System.out.println("语法错误!");
    }

    public TreeNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TreeNode getL_child() {
        return l_child;
    }

    public void setL_child(TreeNode l_child) {
        this.l_child = l_child;
    }

    public TreeNode getR_child() {
        return r_child;
    }

    public void setR_child(TreeNode r_child) {
        this.r_child = r_child;
    }
}
