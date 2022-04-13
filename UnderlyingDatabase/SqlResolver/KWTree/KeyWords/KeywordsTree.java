package KeyWords;

import javax.swing.*;

public class KeywordsTree implements KTreeImpl {
    //创建一棵树
    private Tree tree = new Tree();
    //创建一个根节点
    private KeywordsTreeNode root = new KeywordsTreeNode("xx", "root");

    public KeywordsTree(){
        CreateTree();
    }

    private void CreateTree() {
        //把根节点赋给树(0层)
        tree.setRoot(root);
        //创建子节点
        KeywordsTreeNode treeNode = new KeywordsTreeNode("00", "create");
        KeywordsTreeNode treeNode1 = new KeywordsTreeNode("01", "NAME");
        KeywordsTreeNode treeNode2 = new KeywordsTreeNode("02", "put");
        KeywordsTreeNode treeNode3 = new KeywordsTreeNode("03", "alter");
        KeywordsTreeNode treeNode4 = new KeywordsTreeNode("04", "LIMIT");
        KeywordsTreeNode treeNode5 = new KeywordsTreeNode("05", "METHOD");
        KeywordsTreeNode treeNode6 = new KeywordsTreeNode("06", "get");
        KeywordsTreeNode treeNode7 = new KeywordsTreeNode("07", "list");
        KeywordsTreeNode treeNode8 = new KeywordsTreeNode("08", "delete");
        KeywordsTreeNode treeNode9 = new KeywordsTreeNode("09", "deleteall");
        KeywordsTreeNode treeNode10 = new KeywordsTreeNode("10", "STARTROW");
        KeywordsTreeNode treeNode11 = new KeywordsTreeNode("11", "ENDROW");
        KeywordsTreeNode treeNode12 = new KeywordsTreeNode("12", "enable");
        KeywordsTreeNode treeNode13 = new KeywordsTreeNode("13", "disable");
        KeywordsTreeNode treeNode14 = new KeywordsTreeNode("14", "scan");
        KeywordsTreeNode treeNode15 = new KeywordsTreeNode("15", "count");
        KeywordsTreeNode treeNode16 = new KeywordsTreeNode("16", "exsits");
        KeywordsTreeNode treeNode17 = new KeywordsTreeNode("17", "describe");
        KeywordsTreeNode treeNode18 = new KeywordsTreeNode("18", "drop");
        KeywordsTreeNode treeNode19 = new KeywordsTreeNode("19", "truncate");
        KeywordsTreeNode treeNode20 = new KeywordsTreeNode("20", "{");
        KeywordsTreeNode treeNode21 = new KeywordsTreeNode("21", "}");
        KeywordsTreeNode treeNode22 = new KeywordsTreeNode("22", ",");
        KeywordsTreeNode treeNode23 = new KeywordsTreeNode("23", "=>");
        KeywordsTreeNode treeNode24 = new KeywordsTreeNode("24", ":");
        KeywordsTreeNode treeNode25 = new KeywordsTreeNode("25", "into");
        KeywordsTreeNode treeNode26 = new KeywordsTreeNode("26", "use");
        KeywordsTreeNode treeNode27 = new KeywordsTreeNode("27", "show");
        KeywordsTreeNode treeNode28 = new KeywordsTreeNode("28", "database");
        KeywordsTreeNode treeNode29 = new KeywordsTreeNode("29", "databases");
        KeywordsTreeNode treeNode30 = new KeywordsTreeNode("30", "table");


        //设置(0层)根节点的1层子节点
        root.setLeftNode(treeNode);
        root.setRightNode(treeNode1);
        //设置2层子节点
        treeNode.setLeftNode(treeNode2);
        treeNode.setRightNode(treeNode3);
        treeNode1.setLeftNode(treeNode4);
        treeNode1.setRightNode(treeNode5);
        //设置3层子节点
        treeNode2.setLeftNode(treeNode6);
        treeNode2.setRightNode(treeNode7);
        treeNode3.setLeftNode(treeNode8);
        treeNode3.setRightNode(treeNode9);
        treeNode4.setLeftNode(treeNode10);
        treeNode4.setRightNode(treeNode11);
        treeNode5.setLeftNode(treeNode12);
        treeNode5.setRightNode(treeNode13);
        //设置4层子节点
        treeNode6.setLeftNode(treeNode14);
        treeNode6.setRightNode(treeNode15);
        treeNode7.setLeftNode(treeNode16);
        treeNode7.setRightNode(treeNode17);
        treeNode8.setLeftNode(treeNode18);
        treeNode8.setRightNode(treeNode19);
        treeNode9.setLeftNode(treeNode20);
        treeNode9.setRightNode(treeNode21);
        treeNode10.setLeftNode(treeNode22);
        treeNode10.setRightNode(treeNode23);
        treeNode11.setLeftNode(treeNode24);
        treeNode11.setRightNode(treeNode25);
        treeNode12.setLeftNode(treeNode26);
        treeNode12.setRightNode(treeNode27);
        treeNode13.setLeftNode(treeNode28);
        treeNode13.setRightNode(treeNode29);
        //设置5层子节点
        treeNode14.setLeftNode(treeNode30);
    }


    private String[] arr;

    public void KeyKeywordsTree() {}

    public String[] change1(String[] arr, Tree tree) {
        String nums[] = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = tree.compare(arr[i], tree.root);
        }
        return nums;
    }

    @Override
    public String[] change(String[] arr) {
        return change1(arr,tree);
    }
}