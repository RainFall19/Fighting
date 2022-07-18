package com.company;

import java.io.File;

public class Exists {
    //查看当前库中此表是否存在
    //16
    public void exist(String[] s){
        File file=new File("Database/"+Main.database+"/"+s[0]);
        if (file.exists()){
            System.out.println("此表存在...");
        }
        else {
            System.out.println("此表不存在...");
        }
    }
}
