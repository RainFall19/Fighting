package com.company;

public class TreeNode {
    private String id;
    private TreeNode l_child;
    private TreeNode r_child;

    public void deal_with(){
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

class CreateNode extends TreeNode {
    public CreateNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Create语法错误...");
    }
}

class AlterNode extends TreeNode {
    public AlterNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Alter语法错误...");
    }
}

class ScanNode extends TreeNode {
    public ScanNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Scan语法错误...");
    }
}

class PutNode extends TreeNode {
    public PutNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Put语法错误...");
    }
}

class DeleteNode extends TreeNode {
    public DeleteNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Delete语法错误...");
    }
}

class DeleteAllNode extends TreeNode {
    public DeleteAllNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("DeleteAll语法错误...");
    }
}

class GetNode extends TreeNode {
    public GetNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Get语法错误...");
    }
}

class ListNode extends TreeNode{
    public ListNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("List语法错误...");
    }
}

class DescribeNode extends TreeNode {
    public DescribeNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Describe语法错误...");
    }
}

class EnableNode extends TreeNode {
    public EnableNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Enable语法错误...");
    }
}

class DisableNode extends TreeNode{
    public DisableNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Disable语法错误...");
    }
}

class CountNode extends TreeNode {
    public CountNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Count语法错误...");
    }
}

class ExsitsNode extends TreeNode {
    public ExsitsNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Exsots语法错误...");
    }
}

class DropNode extends TreeNode {
    public DropNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Drop语法错误...");
    }
}

class TruncateNode extends TreeNode {
    public TruncateNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("Truncate语法错误...");
    }
}

class ShowNode extends TreeNode {
    public ShowNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("show语法错误...");
    }
}

class UseNode extends TreeNode {
    public UseNode(String id) {
        super(id);
    }

    @Override
    public void deal_with() {
        System.out.println("use语法错误...");
    }
}
