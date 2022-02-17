package Cache;

import com.company.DataNode;

import java.io.File;

public class Cache {
    private CacheData cache;

    public Cache(){
        new_cache();
    }

    private void new_cache(){
        cache=new CacheData();
        cache.setData(new DataNode());
        CacheData c=cache;
        for (int i=0;i<63;++i){
            c.setNext(new CacheData());
            c=c.getNext();
            c.setData(new DataNode());
        }
        c.setNext(cache);
    }

    public void cache_write(DataNode dataNode){
        cache.setData(dataNode);
        cache= cache.getNext();
    }

    public void cache_read(){

    }

}
