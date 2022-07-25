package Version;

import com.company.Main;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Save {
    /***
     * save
     * 31
     * 保存版本（基于最新版本+1） 输出保存后的版本号
     */
    public void save(){
        File file = new File("Database/"+ Main.database+"/"+Main.table+"/version.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
                BufferedWriter writer=new BufferedWriter(new FileWriter(file));
                writer.write("version1.0\t"+System.currentTimeMillis()+"\n");
                writer.close();
                write_file("version1.0");
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            String read="",s="";
            BufferedReader reader=new BufferedReader(new FileReader(file));
            while ((read=reader.readLine())!=null) {
                s=read;
            }
            reader.close();
            String reg = "\\d+";
            Pattern pattern = Pattern.compile(reg);
            Matcher matcher = pattern.matcher(s);
            matcher.find();
            int v=Integer.valueOf(matcher.group());
            v++;
            BufferedWriter writer=new BufferedWriter(new FileWriter(file,true));
            writer.write("version"+v+".0\t"+System.currentTimeMillis()+"\n");
            System.out.println("version"+v+".0");
            writer.close();
            write_file("version"+v+".0");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /***
     * save v1.0
     * 31
     * 保存版本 版本号（自定义版本号）
     */
    public void save(String ver){
        File file = new File("Database/"+ Main.database+"/"+Main.table+"/version.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
                BufferedWriter writer=new BufferedWriter(new FileWriter(file));
                writer.write(ver+"\t"+System.currentTimeMillis()+"\n");
                writer.close();
                write_file(ver);
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(file,true));
            writer.write(ver+"\t"+System.currentTimeMillis()+"\n");
            System.out.println(ver);
            writer.close();
            write_file(ver);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }








    public void write_file(String s){
        File file=new File("Database/"+Main.database+"/"+Main.table+"/"+s);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        File data=new File("Database/"+Main.database+"/"+Main.table+"/data.txt");
        try {
            BufferedReader reader=new BufferedReader(new FileReader(data));
            BufferedWriter writer=new BufferedWriter(new FileWriter(file));
            String read;
            while ((read=reader.readLine())!=null) {
                writer.write(read+"\n");
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
