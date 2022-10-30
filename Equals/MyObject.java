package com.company;

public class MyObject {
    private int value1=0;
    private int value2=0;
    public MyObject(int value1, int value2){
        this.value1=value1;
        this.value2=value2;
    }
    public boolean equals(Object obj) {
        if(this==obj) return true;//сравнение ссылок
        if(obj==null) return false;
        if(this.getClass()!=obj.getClass()) return false;//сравнение типов
        MyObject buf = (MyObject) obj;
        return (value1==buf.value1 && value2==buf.value2);
    }
}
