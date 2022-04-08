package Cache;

import com.company.DataNode;

import java.util.ArrayList;

public class LRU {
    private int size;
    private int count;
    private LURLinkList list = new LURLinkList();

    public void dis() {
        LURLinkList t = list.getNext();
        while (t != null) {
            System.out.println(t.getData().getId());
            t = t.getNext();
        }
    }

    public ArrayList<DataNode> read(String i) {
        LURLinkList ln = list.getNext();
        ArrayList<DataNode> list1=new ArrayList<>();
        while (ln != null) {
            if (ln.getData().getId().equals(i)) {
                LURLinkList t;
                if (list.getNext() != ln && ln.getNext() != null) {
                    if (ln.getNext() != null) {
                        ln.getNext().setPre(ln.getPre());
                    }
                    if (ln.getPre() != null) {
                        ln.getPre().setNext(ln.getNext());
                    }
                    ln.setNext(list.getNext());
                    list.getNext().setPre(ln);
                    ln.setPre(list);
                    list.setNext(ln);
                }
                list1.add(ln.getData());
            }
            ln = ln.getNext();
        }
        return list1;
    }

    public void write(DataNode i) {
        LURLinkList ln = list.getNext();
        while (ln != null) {
            if (ln.getData().getId() == i.getId()) {
                if (list.getNext() != ln && ln.getNext() != null) {
                    LURLinkList t;
                    if (ln.getNext() != null) {
                        ln.getNext().setPre(ln.getPre());
                    }
                    if (ln.getPre() != null) {
                        ln.getPre().setNext(ln.getNext());
                    }
                    ln.setNext(list.getNext());
                    list.getNext().setPre(ln);
                    ln.setPre(list);
                    list.setNext(ln);
                    return;
                }
            }
            ln = ln.getNext();
        }
        if (count < size) {
            if (count == 0) {
                LURLinkList t = new LURLinkList();
                t.setData(i);
                list.setNext(t);
                t.setPre(list);
                count++;
                return;
            }
            LURLinkList t = new LURLinkList();
            t.setData(i);
            t.setNext(list.getNext());
            list.getNext().setPre(t);
            t.setPre(list);
            list.setNext(t);
            count++;
            return;
        }
        if (count >= size) {
            LURLinkList t = new LURLinkList();
            t.setData(i);
            t.setNext(list.getNext());
            list.getNext().setPre(t);
            t.setPre(list);
            list.setNext(t);
            LURLinkList linkList = list;
            while (linkList.getNext() != null) {
                linkList = linkList.getNext();
            }
            linkList.getPre().setNext(null);
        }
    }

    public LRU(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

