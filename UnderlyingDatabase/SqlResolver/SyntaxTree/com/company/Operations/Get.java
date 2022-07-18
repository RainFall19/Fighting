package com.company.Operations;

import com.company.Main;

import java.io.File;

public class Get {
    /**
     * 获取数据(表中所有列族在指定行上的数据)
     * get  表名,行键
     * 06 22
     */
    //s[0]:tableName;s[1]:RowKey
    public void getData(String[] s) {
        //创建一个文件对象指向当前表文件
        File file = new File("Database/" + Main.database + "/" + s[0] + ".txt");


    }
}
