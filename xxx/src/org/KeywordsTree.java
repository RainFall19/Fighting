package org;

public class KeywordsTree {
    public static void main(String[] args) {
        //创建一棵树
        Tree tree = new Tree();
        //创建一个根节点
        TreeNode root = new TreeNode("xx", "root");
        //把根节点赋给树(0层)
        tree.setRoot(root);

        //创建子节点
        TreeNode treeNode = new TreeNode("00", "create");
        TreeNode treeNode1 = new TreeNode("01", "NAME");
        TreeNode treeNode2 = new TreeNode("02", "put");
        TreeNode treeNode3 = new TreeNode("03", "alter");
        TreeNode treeNode4 = new TreeNode("04", "LIMIT");
        TreeNode treeNode5 = new TreeNode("05", "METHOD");
        TreeNode treeNode6 = new TreeNode("06", "get");
        TreeNode treeNode7 = new TreeNode("07", "list");
        TreeNode treeNode8 = new TreeNode("08", "delete");
        TreeNode treeNode9 = new TreeNode("09", "deleteall");
        TreeNode treeNode10 = new TreeNode("10", "STARTROW");
        TreeNode treeNode11 = new TreeNode("11", "ENDROW");
        TreeNode treeNode12 = new TreeNode("12", "enable");
        TreeNode treeNode13 = new TreeNode("13", "disable");
        TreeNode treeNode14 = new TreeNode("14", "scan");
        TreeNode treeNode15 = new TreeNode("15", "count");
        TreeNode treeNode16 = new TreeNode("16", "exsits");
        TreeNode treeNode17 = new TreeNode("17", "describe");
        TreeNode treeNode18 = new TreeNode("18", "drop");
        TreeNode treeNode19 = new TreeNode("19", "truncate");
        TreeNode treeNode20 = new TreeNode("20", "{");
        TreeNode treeNode21 = new TreeNode("21", "}");
        TreeNode treeNode22 = new TreeNode("22", ",");
        TreeNode treeNode23 = new TreeNode("23", "=>");
        TreeNode treeNode24 = new TreeNode("24", ":");
        TreeNode treeNode25 = new TreeNode("25", "into");
        TreeNode treeNode26 = new TreeNode("26", "use");
        TreeNode treeNode27 = new TreeNode("27", "show");
        TreeNode treeNode28 = new TreeNode("28", "database");
        TreeNode treeNode29 = new TreeNode("29", "databases");
        TreeNode treeNode30 = new TreeNode("30", "table");


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
}