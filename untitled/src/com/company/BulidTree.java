package com.company;

public class BulidTree {
    public void build(TreeRoot t){
        TreeNode create =new TreeNode("00");
        t.setCreate(create);
        build_creat(create);


        TreeNode alter=new TreeNode("03");
        t.setAlter(alter);
        build_alter(alter);

        TreeNode scan=new TreeNode("14"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setScan(scan);
        build_scan(scan);


        TreeNode put=new TreeNode("02");
        t.setPut(put);
        build_put(put);


        TreeNode delete =new TreeNode("08");
        t.setDelete(delete);
        build_delete(delete);


        TreeNode deleteall=new TreeNode("09");
        t.setDeleteall(deleteall);
        bulid_deleteall(deleteall);


        TreeNode get=new TreeNode("06");
        t.setGet(get);
        build_get(get);


        TreeNode list=new TreeNode("07"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setList(list);


        TreeNode describe=new TreeNode("17"){
            @Override
            public void deal_with() {
                System.out.println("132");
            }
        };
        t.setDescribe(describe);


        TreeNode enable=new TreeNode("12"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setEnable(enable);


        TreeNode disabel=new TreeNode("13"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setDisable(disabel);


        TreeNode count =new TreeNode("15"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setCount(count);


        TreeNode exsits=new TreeNode("16"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setExsits(exsits);


        TreeNode drop=new TreeNode("18"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setDrop(drop);
        build_drop(drop);


        TreeNode truncate=new TreeNode("19"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setTruncate(truncate);

        TreeNode show=new TreeNode("27");
        t.setShow(show);
        build_show(show);

        TreeNode use=new TreeNode("26"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setUse(use);
    }

    private void build_creat(TreeNode t){
        TreeNode treeNode_1_l=new TreeNode("22"){
            @Override
            public void deal_with() {
                System.out.println("xxxxx");
            }
        };
        t.setL_child(treeNode_1_l);
        TreeNode treeNode_1_r=new TreeNode("28"){
            @Override
            public void deal_with() {
                System.out.println("zzzzz");
            }
        };
        t.setR_child(treeNode_1_r);


        TreeNode treeNode_2_l=new TreeNode("20");
        treeNode_1_l.setL_child(treeNode_2_l);
        TreeNode treeNode_2_r=new TreeNode("22"){
            @Override
            public void deal_with() {
                System.out.println("ccccc");
            }
        };
        treeNode_1_l.setR_child(treeNode_2_r);


        TreeNode treeNode_3=new TreeNode("01");
        treeNode_2_l.setL_child(treeNode_3);


        TreeNode treeNode_4=new TreeNode("23");
        treeNode_3.setL_child(treeNode_4);


        TreeNode treeNode_5_l=new TreeNode("22");
        TreeNode treeNode_5_r=new TreeNode("21"){
            @Override
            public void deal_with() {
                System.out.println("aaaaa");
            }
        };
        treeNode_4.setL_child(treeNode_5_l);
        treeNode_4.setR_child(treeNode_5_r);


        TreeNode treeNode_l_6 =new TreeNode("23");
        treeNode_5_l.setL_child(treeNode_l_6);


        TreeNode treeNode_l_7=new TreeNode("21"){
            @Override
            public void deal_with() {
                System.out.println("qqqqq");
            }
        };
        treeNode_l_6.setL_child(treeNode_l_7);


        TreeNode treeNode_l_8=new TreeNode("22");
        treeNode_l_7.setL_child(treeNode_l_8);


        TreeNode treeNode_l_9=new TreeNode("20");
        treeNode_l_8.setL_child(treeNode_l_9);


        TreeNode treeNode_l_10=new TreeNode("01");
        treeNode_l_9.setL_child(treeNode_l_10);


        TreeNode treeNode_l_11=new TreeNode("23");
        treeNode_l_10.setL_child(treeNode_l_11);


        TreeNode treeNode_l_12_l =new TreeNode("22");
        TreeNode treeNode_l_12_r=new TreeNode("21"){
            @Override
            public void deal_with() {
                System.out.println("rrrrrr");
            }
        };
        treeNode_l_11.setL_child(treeNode_l_12_l);
        treeNode_l_11.setR_child(treeNode_l_12_r);


        TreeNode treeNode_l_13 =new TreeNode("23");
        treeNode_l_12_l.setL_child(treeNode_l_13);


        TreeNode treeNode_l_14 =new TreeNode("21"){
            @Override
            public void deal_with() {
                System.out.println("wwwww");
            }
        };
        treeNode_l_13.setL_child(treeNode_l_14);


        TreeNode treeNode_r_6 =new TreeNode("22");
        treeNode_5_r.setR_child(treeNode_r_6);


        TreeNode treeNode_r_7=new TreeNode("20");
        treeNode_r_6.setL_child(treeNode_r_7);


        TreeNode treeNode_r_8=new TreeNode("01");
        treeNode_r_7.setL_child(treeNode_r_8);


        TreeNode treeNode_r_9=new TreeNode("23");
        treeNode_r_8.setL_child(treeNode_r_9);


        TreeNode treeNode_r_10_l=new TreeNode("22");
        TreeNode treeNode_r_10_r=new TreeNode("21"){
            @Override
            public void deal_with() {
                System.out.println("ggggggg");
            }
        };
        treeNode_r_9.setL_child(treeNode_r_10_l);
        treeNode_r_9.setR_child(treeNode_r_10_r);


        TreeNode treeNode_r_11=new TreeNode("23");
        treeNode_r_10_l.setL_child(treeNode_r_11);


        TreeNode treeNode_r_12=new TreeNode("21"){
            @Override
            public void deal_with() {
                System.out.println("kkkkkk");
            }
        };
        treeNode_r_11.setL_child(treeNode_r_12);
    }

    private void build_alter(TreeNode t){
        TreeNode treeNode_1_l=new TreeNode("22"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setL_child(treeNode_1_l);
        TreeNode treeNode_1_r=new TreeNode("25"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setR_child(treeNode_1_r);


        TreeNode treeNode_2_l=new TreeNode("20");
        TreeNode treeNode_2_r=new TreeNode("08");
        treeNode_1_l.setL_child(treeNode_2_l);
        treeNode_1_l.setR_child(treeNode_2_r);


        TreeNode treeNode_r_3=new TreeNode("23"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_2_r.setL_child(treeNode_r_3);


        TreeNode treeNode_3=new TreeNode("01");
        treeNode_2_l.setL_child(treeNode_3);


        TreeNode treeNode_4=new TreeNode("23");
        treeNode_3.setL_child(treeNode_4);


        TreeNode treeNode_5_l=new TreeNode("22");
        TreeNode treeNode_5_r=new TreeNode("21"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_4.setL_child(treeNode_5_l);
        treeNode_4.setR_child(treeNode_5_r);


        TreeNode treeNode_l_6=new TreeNode("23");
        treeNode_5_l.setL_child(treeNode_l_6);


        TreeNode treeNode_l_7=new TreeNode("21"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_l_6.setL_child(treeNode_l_7);


        TreeNode treeNode_r_6=new TreeNode("05");
        treeNode_5_l.setR_child(treeNode_r_6);


        TreeNode treeNode_r_7=new TreeNode("23");
        treeNode_r_6.setL_child(treeNode_r_7);


        TreeNode treeNode_r_8=new TreeNode("08");
        treeNode_r_7.setL_child(treeNode_r_8);


        TreeNode treeNode_r_9=new TreeNode("21"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_r_8.setL_child(treeNode_r_9);
    }

    private void build_scan(TreeNode t){
        TreeNode treeNode_1=new TreeNode("22");
        t.setL_child(treeNode_1);


        TreeNode treeNode_2=new TreeNode("20");
        treeNode_1.setL_child(treeNode_2);


        TreeNode treeNode_3_l=new TreeNode("04");
        TreeNode treeNode_3_r=new TreeNode("10");
        treeNode_2.setL_child(treeNode_3_l);
        treeNode_2.setR_child(treeNode_3_r);


        TreeNode treeNode_l_4=new TreeNode("23");
        treeNode_3_l.setL_child(treeNode_l_4);


        TreeNode treeNode_l_5=new TreeNode("21"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_l_4.setL_child(treeNode_l_5);


        TreeNode treeNode_r_4=new TreeNode("23");
        treeNode_3_r.setL_child(treeNode_r_4);


        TreeNode treeNode_r_5_l=new TreeNode("22");
        TreeNode treeNode_r_5_r=new TreeNode("21"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_r_4.setL_child(treeNode_r_5_l);
        treeNode_r_4.setR_child(treeNode_r_5_r);


        TreeNode treeNode_6=new TreeNode("11");
        treeNode_r_5_l.setL_child(treeNode_6);


        TreeNode treeNode_7=new TreeNode("23");
        treeNode_6.setL_child(treeNode_7);


        TreeNode treeNode_8=new TreeNode("21"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_7.setL_child(treeNode_8);
    }

    private void build_put(TreeNode t){
        TreeNode treeNode_1=new TreeNode("22");
        t.setL_child(treeNode_1);


        TreeNode treeNode_2=new TreeNode("22");
        treeNode_1.setL_child(treeNode_2);


        TreeNode treeNode_3=new TreeNode("24");
        treeNode_2.setL_child(treeNode_3);


        TreeNode treeNode_4=new TreeNode("22"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_3.setL_child(treeNode_4);


        TreeNode treeNode_5=new TreeNode("22"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_4.setL_child(treeNode_5);
    }

    private void build_delete(TreeNode t) {
        TreeNode treeNode_1=new TreeNode("22"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setL_child(treeNode_1);


        TreeNode treeNode_2=new TreeNode("22");
        treeNode_1.setL_child(treeNode_2);


        TreeNode treeNode_3=new TreeNode("24"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_2.setL_child(treeNode_3);


        TreeNode treeNode_4=new TreeNode("22"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        treeNode_3.setL_child(treeNode_4);
    }

    private void bulid_deleteall(TreeNode t){
        TreeNode treeNode_1=new TreeNode("22"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setL_child(treeNode_1);
    }

    private void build_get(TreeNode t){
        TreeNode treeNode_1=new TreeNode("22"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setL_child(treeNode_1);
    }

    private void build_show(TreeNode t){
        TreeNode treeNode_1_l=new TreeNode("28"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        TreeNode treeNode_1_r=new TreeNode("29"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setL_child(treeNode_1_l);
        t.setR_child(treeNode_1_r);
    }

    private void build_drop(TreeNode t){
        TreeNode treeNode_1=new TreeNode("28"){
            @Override
            public void deal_with() {
                super.deal_with();
            }
        };
        t.setL_child(treeNode_1);
    }

    public void dis(TreeNode t){
        if(t!=null){
            System.out.println(t.getId());
            dis(t.getL_child());
            dis(t.getR_child());
        }
        else return;
    }
}
