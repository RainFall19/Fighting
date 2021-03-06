package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create {
    //创建数据库
    //00 28
    public void create_database(String[] s){

        File f=new File("Database");
        if(!f.exists()){
            f.mkdir();
        }
        File file=new File("Database/"+s[0]);
        //如果当前文件夹不存在创建文件夹，并使当前使用数据库改为此数据库
        if(!file.exists()){
            file.mkdir();
            System.out.println("创建成功...");
            Main.database=s[0];
        }
        else {
            System.out.println( "当前数据库已创建...");
        }
    }

    //创建表，列族
    //00 22
    //00 22 20 01 23 21
    public void create_table(String[] s){
        File file=new File("Database/"+Main.database+"/"+s[0]);
        if(!file.exists()){
            file.mkdir();
            File f1=new File("Database/"+Main.database);
            if (f1.exists()){
                try{
                    BufferedWriter bw=new BufferedWriter(new FileWriter("Database/"+Main.database+"/p.txt",true));
                    bw.write("表名："+s[0]+"\t列族："+s[1]+"\t创建时间："+System.currentTimeMillis()+"\t修改时间："+System.currentTimeMillis()+"\n");
                    bw.close();
                }catch (IOException e){
                }

            }
            System.out.println("创建成功...");
        }else {
            System.out.println("当前表已创建...");
        }
    }

    //创建表，列族1，2
    //00 22 22
    //00 22 20 01 23 21 22 20 01 23 21
    public void create_table_2(String[] s){
        File file=new File("Database/"+Main.database+"/"+s[0]);
        if(!file.exists()){
            file.mkdir();
            File f1=new File("Database/"+Main.database);
            if (f1.exists()){
                try{
                    BufferedWriter bw=new BufferedWriter(new FileWriter("Database/"+Main.database+"/p.txt",true));
                    bw.write("表名："+s[0]+"\t列族："+s[1]+","+s[2]+"\t创建时间："+System.currentTimeMillis()+"\t修改时间："+System.currentTimeMillis()+"\n");
                    bw.close();
                }catch (IOException e){
                }

            }
            System.out.println("创建成功...");
        }else {
            System.out.println("当前表已创建...");
        }
    }

    //创建表，列族，参数
    //00 22 20 01 23 22 23 21
    public void create_table_c(String[] s){
        File file=new File("Database/"+Main.database+"/"+s[0]);
        if(!file.exists()){
            file.mkdir();
            File f1=new File("Database/"+Main.database);
            if (f1.exists()){
                try{
                    BufferedWriter bw=new BufferedWriter(new FileWriter("Database/"+Main.database+"/p.txt",true));
                    bw.write("表名："+s[0]+"\t列族："+s[1]+"\t"+s[2]+"=>"+s[3]+"\t创建时间："+System.currentTimeMillis()+"\t修改时间："+System.currentTimeMillis()+"\n");
                    bw.close();
                }catch (IOException e){
                }

            }
            System.out.println("创建成功...");
        }else {
            System.out.println("当前表已创建...");
        }
    }

    //创建表，列族，列族2参数
    //00 22 20 01 23 21 22 20 01 23 22 23 21
    public void create_c1(String[] s){
        File file=new File("Database/"+Main.database+"/"+s[0]);
        if(!file.exists()){
            file.mkdir();
            File f1=new File("Database/"+Main.database);
            if (f1.exists()){
                try{
                    BufferedWriter bw=new BufferedWriter(new FileWriter("Database/"+Main.database+"/p.txt",true));
                    bw.write("表名："+s[0]+"\t列族："+s[1]+","+s[2]+"\t"+s[3]+"=>"+s[4]+"\t创建时间："+System.currentTimeMillis()+"\t修改时间："+System.currentTimeMillis()+"\n");
                    bw.close();
                }catch (IOException e){
                }

            }
            System.out.println("创建成功...");
        }else {
            System.out.println("当前表已创建...");
        }
    }

    //创建表，列族1参数，列族2
    //00 22 20 01 23 22 23 21 22 20 01 23 21
    public void create_c2(String[] s){
        File file=new File("Database/"+Main.database+"/"+s[0]);
        if(!file.exists()){
            file.mkdir();
            File f1=new File("Database/"+Main.database);
            if (f1.exists()){
                try{
                    BufferedWriter bw=new BufferedWriter(new FileWriter("Database/"+Main.database+"/p.txt",true));
                    bw.write("表名："+s[0]+"\t列族："+s[1]+"\t"+s[2]+"=>"+s[3]+","+s[4]+"\t创建时间："+System.currentTimeMillis()+"\t修改时间："+System.currentTimeMillis()+"\n");
                    bw.close();
                }catch (IOException e){
                }

            }
            System.out.println("创建成功...");
        }else {
            System.out.println("当前表已创建...");
        }
    }

    //创建表，列族1参数，列族2参数
    //00 22 20 01 23 22 23 21 22 20 01 23 22 23 21
    public void create_c3(String[] s){
        File file=new File("Database/"+Main.database+"/"+s[0]);
        if(!file.exists()){
            file.mkdir();
            File f1=new File("Database/"+Main.database);
            if (f1.exists()){
                try{
                    BufferedWriter bw=new BufferedWriter(new FileWriter("Database/"+Main.database+"/p.txt",true));
                    bw.write("表名："+s[0]+"\t列族："+s[1]+"\t"+s[2]+"=>"+s[3]+","+s[4]+"\t"+s[5]+"=>"+s[6]+"\t创建时间："+System.currentTimeMillis()+"\t修改时间："+System.currentTimeMillis()+"\n");
                    bw.close();
                }catch (IOException e){
                }

            }
            System.out.println("创建成功...");
        }else {
            System.out.println("当前表已创建...");
        }
    }

    
}