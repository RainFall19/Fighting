package com.company.Operations;

import com.company.Main;

import java.io.File;

public class Drop {
    /**
     * 删除表
     * drop  表名
     * 18
     */
    //删除表文件夹下的表文件和表元数据文件
    public void dropTable(String[] s) {//传进来的是非关键字数组
        String tableFileName = "Database/" + Main.database + "/" + s[0];
        //创建一个对象指向要删除的表文件夹
        File file = new File(tableFileName);

        //表文件夹存在
        if (file.exists()) {
            boolean result = deleteDirectory(tableFileName);
            if (result == true) {
                System.out.println("删除表成功");
            } else {
                System.out.println("删除表失败");
            }
        } else {//表文件夹不存在
            System.out.println("删除表失败：" + s[0] + "表文件不存在");
        }
    }

    /**
     * 删除单个表文件
     * fileName 被删除文件的文件名
     * 单个文件删除成功返回true, 否则返回false
     */
    public static boolean deleteFile(String fileName) {
        File file = new File(fileName);
        //表是文件并且表文件存在
        if (file.isFile() && file.exists()) {
            file.delete();
            System.out.println("删除表文件" + fileName + "成功！");
            return true;
        } else {
            System.out.println("删除表文件" + fileName + "失败！");
            return false;
        }
    }

    /**
     * 删除目录(文件夹)以及目录下的文件
     * dirFileName 被删除目录的文件路径
     * 目录删除成功返回true, 否则返回false
     */
    public static boolean deleteDirectory(String dirFileName) {
        //如果dirFileName不以文件分隔符结尾，自动添加文件分隔符
        if (!dirFileName.endsWith(File.separator)) {
            dirFileName = dirFileName + File.separator;
        }
        //创建一个文件对象指向表文件夹
        File dirFile = new File(dirFileName);
        //如果表文件夹dirFileName不存在，或者dirFileName不是一个文件夹，则退出
        if (!dirFile.exists() || !dirFile.isDirectory()) {
            System.out.println("删除表文件夹失败" + dirFileName + "文件夹不存在！");
            return false;
        }
        boolean flag = true;
        //删除文件夹下的所有文件(包括子文件夹)
        File[] files = dirFile.listFiles();
        for (int i = 0; i < files.length; i++) {
            /**删除子文件/子文件夹*/
            //是文件
            if (files[i].isFile()) {
                //删除子文件
                flag = deleteFile(files[i].getAbsolutePath());//getAbsolutePath返回抽象路径名的绝对路径名字符串
                if (!flag) {//删除失败
                    break;
                }
            }
            //是文件夹
            else {
                //删除子文件夹
                flag = deleteDirectory(files[i].getAbsolutePath());
                if (!flag) {
                    break;
                }
            }
        }
        if (!flag) {//删除失败
            System.out.println("删除表文件失败");
            return false;
        }
        //删除当前表文件夹
        if (dirFile.delete()) {
            System.out.println("删除表文件夹" + dirFileName + "成功！");
            return true;
        } else {
            System.out.println("删除表文件夹" + dirFileName + "失败！");
            return false;
        }
    }
}