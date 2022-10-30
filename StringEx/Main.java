package com.company;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void task1(){
        Scanner in = new Scanner(System.in);
        String str2 = in.nextLine();
        //var1
        StringBuilder str1 = new StringBuilder(str2);
        str1.reverse();
        System.out.println(str1);
        //var2
        char[]array=str2.toCharArray();
        for(int i=0, k=str2.length()-1; i<k; i++, k--){
            char buf = array[i];
            array[i]=array[k];
            array[k]=buf;
        }
        str2 = new String(array);
        System.out.println(str2);
        in.close();
    }

    public static void task2() {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int count=0;
        //var1
        while(str1.indexOf(str2)!=-1){
            count++;
            str1=str1.replaceFirst(str2, "");
        }
        System.out.println(count);
        in.close();
    }

    public static void task3() {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String str3 = in.nextLine();
        str1=str1.replace(str2, str3);
        System.out.println(str1);
        in.close();
    }
    public static void main(String[] args) throws IOException {
        /*
        Задание 1
        Пользователь вводит с клавиатуры строку.
        Произведите поворот строк и полученный результат выведите
        на экран.
         */
        //task1();
        /*
        Задание 2
        Пользователь вводит с клавиатуры строку и слово
        для поиска. Посчитайте сколько раз в строке встречается
        искомое слово. Полученное число выведите на экран.
         */
        //task2();
        /*
        Задание 3
        Пользователь вводит с клавиатуры строку, слово для
        поиска, слово для замены. Произведите в строке замену
        одного слова на другое. Полученную строку отобразите
        на экране.
        */
        task3();



    }

}
