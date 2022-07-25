package com.company;

public class TreeRoot {
    private String id;
    private TreeNode create;
    private TreeNode alter;
    private TreeNode scan;
    private TreeNode put;
    private TreeNode delete;
    private TreeNode deleteall;
    private TreeNode get;
    private TreeNode list;
    private TreeNode describe;
    private TreeNode enable;
    private TreeNode disable;
    private TreeNode count;
    private TreeNode exists;
    private TreeNode drop;
    private TreeNode truncate;
    private TreeNode show;
    private TreeNode use;
    private TreeNode save;

    public TreeNode getSave() {
        return save;
    }

    public void setSave(TreeNode save) {
        this.save = save;
    }

    public TreeNode getShow() {
        return show;
    }

    public void setShow(TreeNode show) {
        this.show = show;
    }

    public TreeNode getUse() {
        return use;
    }

    public void setUse(TreeNode use) {
        this.use = use;
    }

    public TreeNode getAlter() {
        return alter;
    }

    public void setAlter(TreeNode alter) {
        this.alter = alter;
    }

    public TreeNode getScan() {
        return scan;
    }

    public void setScan(TreeNode scan) {
        this.scan = scan;
    }

    public TreeNode getPut() {
        return put;
    }

    public void setPut(TreeNode put) {
        this.put = put;
    }

    public TreeNode getDelete() {
        return delete;
    }

    public void setDelete(TreeNode delete) {
        this.delete = delete;
    }

    public TreeNode getDeleteall() {
        return deleteall;
    }

    public void setDeleteall(TreeNode deleteall) {
        this.deleteall = deleteall;
    }

    public TreeNode getGet() {
        return get;
    }

    public void setGet(TreeNode get) {
        this.get = get;
    }

    public TreeNode getList() {
        return list;
    }

    public void setList(TreeNode list) {
        this.list = list;
    }

    public TreeNode getDescribe() {
        return describe;
    }

    public void setDescribe(TreeNode describe) {
        this.describe = describe;
    }

    public TreeNode getEnable() {
        return enable;
    }

    public void setEnable(TreeNode enable) {
        this.enable = enable;
    }

    public TreeNode getDisable() {
        return disable;
    }

    public void setDisable(TreeNode disable) {
        this.disable = disable;
    }

    public TreeNode getCount() {
        return count;
    }

    public void setCount(TreeNode count) {
        this.count = count;
    }

    public TreeNode getExists() {
        return exists;
    }

    public void setExists(TreeNode exsits) {
        this.exists = exsits;
    }

    public TreeNode getDrop() {
        return drop;
    }

    public void setDrop(TreeNode drop) {
        this.drop = drop;
    }

    public TreeNode getTruncate() {
        return truncate;
    }

    public void setTruncate(TreeNode truncate) {
        this.truncate = truncate;
    }

    public TreeRoot(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TreeNode getCreate() {
        return create;
    }

    public void setCreate(TreeNode create) {
        this.create = create;
    }

    public void deal(String[] s,String[] n){
        switch (s[0]){
            case "00":{
                dis(s,create,0,n);
                break;
            }
            case "03":{
                dis(s,alter,0,n);
                break;
            }
            case "14":{
                dis(s,scan,0,n);
                break;
            }
            case "02":{
                dis(s,put,0,n);
                break;
            }
            case "08":{
                dis(s,delete,0,n);
                break;
            }
            case "09":{
                dis(s,deleteall,0,n);
                break;
            }
            case "06":{
                dis(s,get,0,n);
                break;
            }
            case "07":{
                dis(s,list,0,n);
                break;
            }
            case "17":{
                dis(s,describe,0,n);
                break;
            }
            case "12":{
                dis(s,enable,0,n);
                break;
            }
            case "13":{
                dis(s,disable,0,n);
                break;
            }
            case "15":{
                dis(s,count,0,n);
                break;
            }
            case "16":{
                dis(s,exists,0,n);
                break;
            }
            case "18":{
                dis(s,drop,0,n);
                break;
            }
            case "19":{
                dis(s,truncate,0,n);
                break;
            }
            case "26":{
                dis(s,use,0,n);
            }
            case "31":{
                dis(s,save,0,n);
            }
        }
    }

    private void dis(String[] s,TreeNode t,int x,String[] n){
        if(t!=null){
            if(x<(s.length-1)){
                if(s[x].equals(t.getId())){
                    dis(s,t.getL_child(),++x,n);
                    dis(s,t.getR_child(),x,n);
                }
            }else if (x==s.length-1){
                if(s[x].equals(t.getId())){
                    t.deal_with(n);
                }
            }
        }
        else {
            return;
        }
    }
}
