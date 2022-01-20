package KeyWords;


public class Tree{

    KeywordsTreeNode root;

    //获取根节点
    public KeywordsTreeNode getRoot() {
        return root;
    }

    //设置根节点
    public void setRoot(KeywordsTreeNode root) {
        this.root = root;
    }


    public String compare(String str, KeywordsTreeNode root) {
        if (str == root.keyword) {
            return root.num;
        }
        if (root.leftNode != null) {
            compare(str, root.leftNode);
        }
        if (root.rightNode != null) {
            compare(str, root.rightNode);
        }
        return null;
    }
}