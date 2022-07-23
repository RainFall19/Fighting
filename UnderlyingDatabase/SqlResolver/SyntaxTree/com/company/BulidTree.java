package com.company;

public class BulidTree {
    //建立语法树
    public void build(TreeRoot t){
        //建立create根节点
        TreeNode create =new CreateNode("00");
        t.setCreate(create);
        build_creat(create);


        //建立alter根节点
        TreeNode alter=new AlterNode("03");
        t.setAlter(alter);
        build_alter(alter);


        //建立scan根节点
        TreeNode scan=new ScanNode("14"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        t.setScan(scan);
        build_scan(scan);


        //建立put根节点
        TreeNode put=new PutNode("02");
        t.setPut(put);
        build_put(put);


        //建立delete根节点
        TreeNode delete =new DeleteNode("08");
        t.setDelete(delete);
        build_delete(delete);


        //建立deleteall根节点
        TreeNode deleteall=new DeleteAllNode("09");
        t.setDeleteall(deleteall);
        bulid_deleteall(deleteall);


        //建立get根节点
        TreeNode get=new GetNode("06");
        t.setGet(get);
        build_get(get);


        //建立list根节点
        TreeNode list=new ListNode("07"){
            @Override
            public void deal_with(String[] s) {
                List list=new List();
                list.list();
            }
        };
        t.setList(list);


        //建立describe根节点
        TreeNode describe=new DescribeNode("17"){
            @Override
            public void deal_with(String[] s) {
                System.out.println("132");
            }
        };
        t.setDescribe(describe);


        //建立enable根节点
        TreeNode enable=new EnableNode("12"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        t.setEnable(enable);


        //建立disable根节点
        TreeNode disable=new DisableNode("13"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        t.setDisable(disable);


        //建立count根节点
        TreeNode count =new CountNode("15"){
            @Override
            public void deal_with(String[] s) {
                Count count1=new Count();
                count1.count(s);
            }
        };
        t.setCount(count);


        //建立exists根节点
        TreeNode exists=new ExistsNode("16"){
            @Override
            public void deal_with(String[] s) {
                Exists exists=new Exists();
                exists.exist(s);
            }
        };
        t.setExists(exists);


        //建立drop根节点
        TreeNode drop=new DropNode("18"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        t.setDrop(drop);
        build_drop(drop);


        //建立truncate根节点
        TreeNode truncate=new TruncateNode("19"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        t.setTruncate(truncate);


        //建立show根节点
        TreeNode show=new ShowNode("27");
        t.setShow(show);
        build_show(show);


        //建立use根节点
        TreeNode use=new UseNode("26"){
            @Override
            public void deal_with(String[] s) {
                Use use1=new Use();
                use1.use(s);
            }
        };
        t.setUse(use);
    }


    //建立create树
    private void build_creat(TreeNode t){
        TreeNode treeNode_1_l=new CreateNode("22"){
            @Override
            public void deal_with(String[] s) {
                Create create=new Create();
                create.create_table(s);
            }
        };
        t.setL_child(treeNode_1_l);
        TreeNode treeNode_1_r=new CreateNode("28"){
            @Override
            public void deal_with(String[] s) {
                Create create=new Create();
                create.create_database(s);
            }
        };
        t.setR_child(treeNode_1_r);


        TreeNode treeNode_2_l=new CreateNode("20");
        treeNode_1_l.setL_child(treeNode_2_l);
        TreeNode treeNode_2_r=new CreateNode("22"){
            @Override
            public void deal_with(String[] s) {
                Create create=new Create();
                create.create_table_2(s);
            }
        };
        treeNode_1_l.setR_child(treeNode_2_r);


        TreeNode treeNode_3=new CreateNode("01");
        treeNode_2_l.setL_child(treeNode_3);


        TreeNode treeNode_4=new CreateNode("23");
        treeNode_3.setL_child(treeNode_4);


        TreeNode treeNode_5_l=new CreateNode("22");
        TreeNode treeNode_5_r=new CreateNode("21"){
            @Override
            public void deal_with(String[] s) {
                Create create=new Create();
                create.create_table(s);
            }
        };
        treeNode_4.setL_child(treeNode_5_l);
        treeNode_4.setR_child(treeNode_5_r);


        TreeNode treeNode_l_6 =new CreateNode("23");
        treeNode_5_l.setL_child(treeNode_l_6);


        TreeNode treeNode_l_7=new CreateNode("21"){
            @Override
            public void deal_with(String[] s) {
                Create create=new Create();
                create.create_table_c(s);
            }
        };
        treeNode_l_6.setL_child(treeNode_l_7);


        TreeNode treeNode_l_8=new CreateNode("22");
        treeNode_l_7.setL_child(treeNode_l_8);


        TreeNode treeNode_l_9=new CreateNode("20");
        treeNode_l_8.setL_child(treeNode_l_9);


        TreeNode treeNode_l_10=new CreateNode("01");
        treeNode_l_9.setL_child(treeNode_l_10);


        TreeNode treeNode_l_11=new CreateNode("23");
        treeNode_l_10.setL_child(treeNode_l_11);


        TreeNode treeNode_l_12_l =new CreateNode("22");
        TreeNode treeNode_l_12_r=new CreateNode("21"){
            @Override
            public void deal_with(String[] s) {
                Create create=new Create();
                create.create_c2(s);
            }
        };
        treeNode_l_11.setL_child(treeNode_l_12_l);
        treeNode_l_11.setR_child(treeNode_l_12_r);


        TreeNode treeNode_l_13 =new CreateNode("23");
        treeNode_l_12_l.setL_child(treeNode_l_13);


        TreeNode treeNode_l_14 =new CreateNode("21"){
            @Override
            public void deal_with(String[] s) {
                //00 22 20 01 23 22 23 21 22 20 01 23 22 23 21
                Create create=new Create();
                create.create_c3(s);
            }
        };
        treeNode_l_13.setL_child(treeNode_l_14);


        TreeNode treeNode_r_6 =new CreateNode("22");
        treeNode_5_r.setR_child(treeNode_r_6);


        TreeNode treeNode_r_7=new CreateNode("20");
        treeNode_r_6.setL_child(treeNode_r_7);


        TreeNode treeNode_r_8=new CreateNode("01");
        treeNode_r_7.setL_child(treeNode_r_8);


        TreeNode treeNode_r_9=new CreateNode("23");
        treeNode_r_8.setL_child(treeNode_r_9);


        TreeNode treeNode_r_10_l=new CreateNode("22");
        TreeNode treeNode_r_10_r=new CreateNode("21"){
            @Override
            public void deal_with(String[] s) {
                //00 22 20 01 23 21 22 20 01 23 21
                Create create=new Create();
                create.create_table_2(s);
            }
        };
        treeNode_r_9.setL_child(treeNode_r_10_l);
        treeNode_r_9.setR_child(treeNode_r_10_r);


        TreeNode treeNode_r_11=new CreateNode("23");
        treeNode_r_10_l.setL_child(treeNode_r_11);


        TreeNode treeNode_r_12=new CreateNode("21"){
            @Override
            public void deal_with(String[] s) {
                Create create=new Create();
                create.create_c1(s);
                //00 22 20 01 23 21 22 20 01 23 22 23 21
            }
        };
        treeNode_r_11.setL_child(treeNode_r_12);
    }


    //建立alter树
    private void build_alter(TreeNode t){
        TreeNode treeNode_1_l=new AlterNode("22"){
            @Override
            public void deal_with(String[] s) {
                Alter alter=new Alter();
                alter.alter_lie(s);
            }
        };
        t.setL_child(treeNode_1_l);
        TreeNode treeNode_1_r=new AlterNode("25"){
            @Override
            public void deal_with(String[] s) {
                Alter alter=new Alter();
                alter.alter_database(s);
            }
        };
        t.setR_child(treeNode_1_r);


        TreeNode treeNode_2_l=new AlterNode("20");
        TreeNode treeNode_2_r=new AlterNode("08");
        treeNode_1_l.setL_child(treeNode_2_l);
        treeNode_1_l.setR_child(treeNode_2_r);


        TreeNode treeNode_r_3=new AlterNode("23"){
            @Override
            public void deal_with(String[] s) {
                Alter alter=new Alter();
                alter.alter_delete(s);
            }
        };
        treeNode_2_r.setL_child(treeNode_r_3);


        TreeNode treeNode_3=new AlterNode("01");
        treeNode_2_l.setL_child(treeNode_3);
        TreeNode treeNode_3_r=new TreeNode("23");
        treeNode_2_l.setR_child(treeNode_3_r);

        TreeNode treeNode_4=new AlterNode("23");
        treeNode_3.setL_child(treeNode_4);
        TreeNode treeNode_4_r=new TreeNode("21"){
            @Override
            public void deal_with(String[] s) {
                Alter alter=new Alter();
                alter.alter_info(s);
            }
        };
        treeNode_3_r.setR_child(treeNode_4_r);

        TreeNode treeNode_5_l=new AlterNode("22");
        treeNode_4.setL_child(treeNode_5_l);


        TreeNode treeNode_l_6=new AlterNode("23");
        treeNode_5_l.setL_child(treeNode_l_6);


        TreeNode treeNode_l_7=new AlterNode("21"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        treeNode_l_6.setL_child(treeNode_l_7);


        TreeNode treeNode_r_6=new AlterNode("05");
        treeNode_5_l.setR_child(treeNode_r_6);


        TreeNode treeNode_r_7=new AlterNode("23");
        treeNode_r_6.setL_child(treeNode_r_7);


        TreeNode treeNode_r_8=new AlterNode("08");
        treeNode_r_7.setL_child(treeNode_r_8);


        TreeNode treeNode_r_9=new AlterNode("21"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        treeNode_r_8.setL_child(treeNode_r_9);
    }


    //建立scan树
    private void build_scan(TreeNode t){
        TreeNode treeNode_1=new ScanNode("22");
        t.setL_child(treeNode_1);


        TreeNode treeNode_2=new ScanNode("20");
        treeNode_1.setL_child(treeNode_2);


        TreeNode treeNode_3_l=new ScanNode("04");
        TreeNode treeNode_3_r=new ScanNode("10");
        treeNode_2.setL_child(treeNode_3_l);
        treeNode_2.setR_child(treeNode_3_r);


        TreeNode treeNode_l_4=new ScanNode("23");
        treeNode_3_l.setL_child(treeNode_l_4);


        TreeNode treeNode_l_5=new ScanNode("21"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        treeNode_l_4.setL_child(treeNode_l_5);


        TreeNode treeNode_r_4=new ScanNode("23");
        treeNode_3_r.setL_child(treeNode_r_4);


        TreeNode treeNode_r_5_l=new ScanNode("22");
        TreeNode treeNode_r_5_r=new ScanNode("21"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        treeNode_r_4.setL_child(treeNode_r_5_l);
        treeNode_r_4.setR_child(treeNode_r_5_r);


        TreeNode treeNode_6=new ScanNode("11");
        treeNode_r_5_l.setL_child(treeNode_6);


        TreeNode treeNode_7=new ScanNode("23");
        treeNode_6.setL_child(treeNode_7);


        TreeNode treeNode_8=new ScanNode("21"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        treeNode_7.setL_child(treeNode_8);
    }


    //建立put树
    private void build_put(TreeNode t){
        TreeNode treeNode_1=new PutNode("22");
        TreeNode treeNode_1_r=new PutNode("24");
        t.setL_child(treeNode_1);
        t.setR_child(treeNode_1_r);

        TreeNode treeNode_2=new PutNode("22");
        TreeNode treeNode_2_r=new PutNode("24");
        treeNode_1.setL_child(treeNode_2);
        treeNode_1.setR_child(treeNode_2_r);

        TreeNode treeNode_r_2=new PutNode("20");
        TreeNode treeNode_r_2_r=new PutNode("22"){
            @Override
            public void deal_with(String[] s) {
                if (Main.service.put_new_data(s,2)) {
                    System.out.println("添加成功...");
                }else {
                    System.out.println("添加失败...");
                }
            }
        };
        treeNode_1_r.setL_child(treeNode_r_2);
        treeNode_1_r.setR_child(treeNode_r_2_r);

        TreeNode treeNode_3=new PutNode("24");
        treeNode_2.setL_child(treeNode_3);

        TreeNode treeNode_3_r=new PutNode("22"){
            @Override
            public void deal_with(String[] s) {
                if (Main.service.put_new_data(s,1)) {
                    System.out.println("添加成功...");
                }else {
                    System.out.println("添加失败...");
                }
            }
        };
        treeNode_2_r.setL_child(treeNode_3_r);

        TreeNode treeNode_r_3=new PutNode("21"){
            @Override
            public void deal_with(String[] s) {
                int x = s[0].length();
                char[] c = s[0].toCharArray();
                for (int i = 0; i < s[0].length(); ++i) {
                    if (c[i] >= '0' && c[i] <= '9') {
                        x--;
                    }
                }
                if (x != 0) {
                    if (Main.service.put_new_data(s, 3)) {
                        System.out.println("添加成功...");
                    } else {
                        System.out.println("添加失败...");
                    }
                }else if(x==0){
                    if (Main.service.put_new_data(s, 4)) {
                        System.out.println("添加成功...");
                    } else {
                        System.out.println("添加失败...");
                    }
                }
            }
        };
        treeNode_r_2.setL_child(treeNode_r_3);

        TreeNode treeNode_4=new PutNode("22"){
            @Override
            public void deal_with(String[] s) {
                if (Main.service.put_new_data(s,0)) {
                    System.out.println("添加成功...");
                }else {
                    System.out.println("添加失败...");
                }
            }
        };
        treeNode_3.setL_child(treeNode_4);


        TreeNode treeNode_5=new PutNode("22"){
            @Override
            public void deal_with(String[] s) {
                if (Main.service.put_new_data(s,0)) {
                    System.out.println("添加成功...");
                }else {
                    System.out.println("添加失败...");
                }
            }
        };
        treeNode_4.setL_child(treeNode_5);
    }


    //建立delete树
    private void build_delete(TreeNode t) {
        TreeNode treeNode_1=new DeleteNode("22"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        t.setL_child(treeNode_1);


        TreeNode treeNode_2=new DeleteNode("22"){
            @Override
            public void deal_with(String[] s) {
                Delete delete=new Delete();
                delete.delete_info(s);
            }
        };
        treeNode_1.setL_child(treeNode_2);


        TreeNode treeNode_3=new DeleteNode("24"){
            @Override
            public void deal_with(String[] s) {
                Delete delete=new Delete();
                delete.delete_info_lie(s);
            }
        };
        treeNode_2.setL_child(treeNode_3);


        TreeNode treeNode_4=new DeleteNode("22"){
            @Override
            public void deal_with(String[] s) {
                Delete delete=new Delete();
                delete.delete_info_time(s);
            }
        };
        treeNode_3.setL_child(treeNode_4);
    }


    //建立deleteall树
    private void bulid_deleteall(TreeNode t){
        TreeNode treeNode_1=new DeleteAllNode("22"){
            @Override
            public void deal_with(String[] s) {
                DeleteAll deleteAll=new DeleteAll();
                deleteAll.delete_all(s);
            }
        };
        t.setL_child(treeNode_1);
    }


    //建立get树
    private void build_get(TreeNode t){
        TreeNode treeNode_1=new GetNode("22"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        t.setL_child(treeNode_1);
    }


    //建立show树
    private void build_show(TreeNode t){
        TreeNode treeNode_1_l=new ShowNode("28"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        TreeNode treeNode_1_r=new ShowNode("29"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        t.setL_child(treeNode_1_l);
        t.setR_child(treeNode_1_r);
    }


    //建立drop树
    private void build_drop(TreeNode t){
        TreeNode treeNode_1=new DropNode("18"){
            @Override
            public void deal_with(String[] s) {
                super.deal_with(s);
            }
        };
        t.setL_child(treeNode_1);
    }


    //测试用品
    public void dis(TreeNode t){
        if(t!=null){
            System.out.println(t.getId());
            dis(t.getL_child());
            dis(t.getR_child());
        }
        else return;
    }
}
