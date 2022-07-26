package Version;

import com.company.Main;

import java.io.*;

public class Rollback {
    public void rollback(String[] s){
        File file=new File("Database/"+ Main.database+"/"+Main.table+"/"+s[0]);
        if (!file.exists()){
            System.out.println("输入版本不存在...");
        }

        try {
            BufferedReader reader=new BufferedReader(new FileReader(file));
            String read="";
            String write="";
            while ((read=reader.readLine())!=null){
                write+=read+"\n";
            }
            reader.close();
            BufferedWriter writer=new BufferedWriter(new FileWriter("Database/"+ Main.database+"/"+Main.table+"/data.txt"));
            writer.write(write);
            writer.close();
            System.out.println("版本回滚成功...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
