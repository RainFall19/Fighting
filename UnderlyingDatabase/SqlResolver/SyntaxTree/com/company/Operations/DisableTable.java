package com.company.Operations;

//import org.apache.hadoop.conf.Configuration;
//import org.apache.hadoop.hbase.HBaseConfiguration;
//import org.apache.hadoop.hbase.client.HBaseAdmin;
//
//import java.io.IOException;

public class DisableTable {//暂时先把表改为只读不可写,待改

    /**
     * (先禁用再删除)禁用表
     * disable  表名
     * 13
     */   //传进来的是非关键字数组
    public void disable_table(String[] s) {
//        //实例化 HBaseAdmin
//        Configuration configuration = HBaseConfiguration.create();
//        HBaseAdmin admin = new HBaseAdmin(configuration);
//
//        //验证表 People 是否被禁用
//        Boolean isDisabled = admin.isTableDisabled("People");
//
//        //如果未被禁用这禁用表
//        if (!isDisabled) {
//            admin.disableTable("People");
//            System.out.println("Table disabled");
//        }
    }
}