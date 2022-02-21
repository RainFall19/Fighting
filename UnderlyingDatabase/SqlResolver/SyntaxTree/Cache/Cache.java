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
        CacheData c=cache;
        for (int i=1;i<64;++i){
            c.setNext(new CacheData());
            c=c.getNext();
        }
        c.setNext(cache);
    }


    public void cache_write(DataNode dataNode){
        cache=cache.getNext();
        cache.setData(dataNode);
    }

    public boolean cache_read(String id){
        CacheData cacheData=cache;
            do {
                if(cacheData.getData()!=null && cacheData.getData().getId()==id){
                    DataNode data=cacheData.getData();
                    System.out.println("ID:"+data.getId()+"\tinfo:"+data.getInfo()
                            + "\t"+data.getKey()+"="+ data.getVal()+"\t时间:"+data.getTime());
                    return true;
                }
                cacheData=cacheData.getNext();
            }while (cacheData!=cache);
        return false;
    }

}
