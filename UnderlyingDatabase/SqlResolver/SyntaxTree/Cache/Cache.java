package Cache;

import com.company.DataNode;

import java.io.File;
import java.util.HashMap;

public class Cache {
    private HashMap<String,DataNode> cache=new HashMap<>();

    public Cache(){

    }



    public void cache_write(DataNode dataNode){
        if (cache.get(dataNode.getId())!=null){
            return;
        }
        cache.put(dataNode.getId(),dataNode);
    }

    public boolean cache_read(String id){
        if (cache.get(id)!=null){
            System.out.println("ID:"+cache.get(id).getId()+"\tinfo:"+cache.get(id).getInfo()
                    + "\t"+cache.get(id).getKey()+"="+ cache.get(id).getVal()+"\t时间:"+cache.get(id).getTime());
            return true;
        }
        return false;
    }

}
