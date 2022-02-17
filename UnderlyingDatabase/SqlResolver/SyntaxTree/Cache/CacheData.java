package Cache;

import com.company.DataNode;

public class CacheData {
    private DataNode data;
    private CacheData next;

    public DataNode getData() {
        return data;
    }

    public void setData(DataNode data) {
        this.data = data;
    }

    public CacheData getNext() {
        return next;
    }

    public void setNext(CacheData next) {
        this.next = next;
    }
}
