package org;

public class TreeNode {

    //节点的关键字
    String keyword;
    //节点的数字代号
    String num;

    //左右节点
    TreeNode leftNode;
    TreeNode rightNode;

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode(String num, String keyword) {
        this.num = num;
        this.keyword = keyword;
    }
}