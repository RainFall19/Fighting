package Cache;

import com.company.DataNode;

public class LRU {
    private int size;
    private int count;
    private LURLinkList list = new LURLinkList();

    public void dis() {
        LURLinkList t = list.getNext();
        while (t != null) {
            System.out.println(t.getData());
            t = t.getNext();
        }
    }

    public DataNode read(String i) {
        LURLinkList ln = list;
        while (ln != null) {
            if (ln.getData().getId() == i) {
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
                return ln.getData();
            }
            ln = ln.getNext();
        }
        return null;
    }

    public void write(DataNode i) {
        LURLinkList ln = list;
        while (ln != null) {
            if (ln.getData().getId() == i.getId()) {
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

