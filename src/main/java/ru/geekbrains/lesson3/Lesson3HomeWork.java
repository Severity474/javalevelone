package ru.geekbrains.lesson3;

public class Lesson3HomeWork {

    public static void main(String[] args) {

    }

    static boolean doTask1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;}
    }
    static void doTask2(int a) {
        if (a > 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }


    }

    static boolean doTask3(int a) {
        if ( a<0 )
         { return true;
        } else {
            return false;}


    }

    static void doTask4(int a, String b) {
        int i;
        for (i=0;i<a;i++){
            System.out.println(b);
        }
    }

    }
