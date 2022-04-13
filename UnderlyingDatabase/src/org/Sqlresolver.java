package org;

import KeyWords.KTreeImpl;
import KeyWords.KeywordsTree;
import tokeniz.Tok;
import tokeniz.TokenizImpl;
import tokeniz.abc;

import java.util.Scanner;

public class Sqlresolver {
    public static void main(String[] args) {
        //监听用户端发来的sql语句(String)
        Scanner scanner = new Scanner(System.in);
        String sql = scanner.nextLine();

        //调用分词接口，传进去一个sql语句(String),返回来一个分词完后的(String)数组
        //String[] tokeniz (String sql)
        Tok ti = new Tok();
        String[] sqlkw = ti.tokeizSqlkw(sql);//分词好的关键字数组
        String[] sqlunkw = ti.tokeizSqlunkw(sql);//分词好的非关键字数组


        //调用关键字树接口，传进去分词好的关键字数组(String)，返回语义分析后的数字串的数组
        //String[] change(String[] arr)
        KTreeImpl kt = new KeywordsTree();
        String[] arr = kt.change(sqlkw);//语义分析后的数字串的数组

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //调用语法树接口，传进去语义分析后的数字串的数组，进行语法分析并执行操作，返回是否操作成功
        //boolean Syntax(String[] arr)
    }
}
