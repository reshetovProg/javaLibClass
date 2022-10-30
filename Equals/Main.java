package com.company;
import java.io.IOException;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws IOException {
        Integer num1 = new Integer(3);
        System.out.println(num1.getClass());
        MyObject obj1 = new MyObject(2,3);
        MyObject obj2 = new MyObject(2,3);
        System.out.println(obj1.equals(obj2));

    }

}
