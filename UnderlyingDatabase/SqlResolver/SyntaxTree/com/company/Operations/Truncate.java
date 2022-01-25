package com.company.Operations;

import com.company.Create;

public class Truncate {
    /**
     * 清空表(禁用->删除表->按原结构重新建立表)
     * truncate  表名
     * 19
     */
    public void truncate(String[] s) {
        //1 禁用表
        DisableTable disable=new DisableTable();
        disable.disable_table(s);

        //2 删除表
        Drop drop=new Drop();
        drop.dropTable(s);

        //3 按原结构重新建立表
        Create create=new Create();
        create.create_database(s);
    }
}
