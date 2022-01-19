package KeyWords;

public class KeywordsTreeNode {

    //节点的关键字
    String keyword;
    //节点的数字代号
    String num;

    //左右节点
    KeywordsTreeNode leftNode;
    KeywordsTreeNode rightNode;

    public void setLeftNode(KeywordsTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(KeywordsTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public KeywordsTreeNode(String num, String keyword) {
        this.num = num;
        this.keyword = keyword;
    }
}