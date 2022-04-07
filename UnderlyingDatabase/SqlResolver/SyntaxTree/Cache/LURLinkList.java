package Cache;

import com.company.DataNode;

public class LURLinkList {
    private DataNode data;
    private LURLinkList pre;
    private LURLinkList next;

    public DataNode getData() {
        return data;
    }

    public void setData(DataNode data) {
        this.data = data;
    }

    public LURLinkList getPre() {
        return pre;
    }

    public void setPre(LURLinkList pre) {
        this.pre = pre;
    }

    public LURLinkList getNext() {
        return next;
    }

    public void setNext(LURLinkList next) {
        this.next = next;
    }
}
