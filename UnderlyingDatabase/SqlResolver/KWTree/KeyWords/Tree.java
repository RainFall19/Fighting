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
        String s = null;
        if (str.equals(root.keyword) ) {
            return root.num;
        }
        if (root.leftNode != null) {
            s=compare(str, root.leftNode);
        }
        if(s!=null){
            return s;
        }
        if (root.rightNode != null) {
            s=compare(str, root.rightNode);
        }
        return s;
    }
}