package com.company;

public class DataNodeLink {
    private DataNode data;
    private DataNodeLink next;
    private DataNodeLink tail;

    public DataNode getData() {
        return data;
    }

    public void setData(DataNode data) {
        this.data = data;
    }

    public DataNodeLink getNext() {
        return next;
    }

    public void setNext(DataNodeLink next) {
        this.next = next;
    }

    public DataNodeLink getTail() {
        return tail;
    }

    public void setTail(DataNodeLink tail) {
        this.tail = tail;
    }
}
