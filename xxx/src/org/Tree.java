package org;

public class Tree {

    TreeNode root;

    //树的层数
    int level;

    //获取根节点
    public TreeNode getRoot() {
        return root;
    }

    //设置根节点
    public void setRoot(TreeNode root) {
        this.root = root;
    }
}