package KeyWords;


public class Tree implements KTreeImpl{

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

    @Override
    public String[] change(String[] arr, Tree tree) {
        String nums[] = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = tree.compare(arr[i], tree.root);
        }
        return nums;
    }
}