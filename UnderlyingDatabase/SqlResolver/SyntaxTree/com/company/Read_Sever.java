package com.company;

public class Read_Sever {
    private DataNodeLink data;
    private Read_Sever next;

    public Read_Sever getNext() {
        return next;
    }

    public void setNext(Read_Sever next) {
        this.next = next;
    }

    public DataNodeLink getData() {
        return data;
    }

    public void setData(DataNodeLink data) {
        this.data = data;
    }
}
