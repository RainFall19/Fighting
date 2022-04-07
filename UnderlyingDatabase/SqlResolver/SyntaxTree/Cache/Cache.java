package Cache;

import com.company.DataNode;
import com.sun.org.apache.bcel.internal.generic.LNEG;

import java.io.File;
import java.util.HashMap;

public class Cache {
    private LRU lurCache;

    public Cache(int size){
        lurCache =new LRU(size);
    }

    public void cache_write(DataNode dataNode){
        if (lurCache.read(dataNode.getId())!=null){
            return;
        }
        lurCache.write(dataNode);
    }

    public boolean cache_read(String id){
        DataNode node;
        if ((node=lurCache.read(id))!=null){
            System.out.println("ID:"+node.getId()+"\tinfo:"+node.getInfo()
                    + "\t"+node.getKey()+"="+ node.getVal()+"\t时间:"+ node.getTime());
            return true;
        }
        return false;
    }

}
