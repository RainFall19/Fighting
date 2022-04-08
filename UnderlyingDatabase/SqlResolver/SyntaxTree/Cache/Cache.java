package Cache;

import com.company.DataNode;
import com.sun.org.apache.bcel.internal.generic.LNEG;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Cache {
    private LRU lurCache;

    public Cache(int size){
        lurCache =new LRU(size);
    }

    public void cache_write(DataNode dataNode){
        ArrayList<DataNode> list;
        list=lurCache.read(dataNode.getId());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)==dataNode){
                return;
            }
        }
        lurCache.write(dataNode);
    }

    public boolean cache_read(String id){
        ArrayList<DataNode> list;
        list=lurCache.read(id);
        if (list.size()!=0){
            for (int i = 0; i < list.size(); i++) {
                DataNode node=list.get(i);
                System.out.println("ID:"+node.getId()+"\tinfo:"+node.getInfo()
                        + "\t"+node.getKey()+"="+ node.getVal()+"\t时间:"+ node.getTime()+"\tcache");
            }
            return true;
        }
        return false;
    }

}
