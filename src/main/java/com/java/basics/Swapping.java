package com.java.basics;

public class Swapping {
    public static void main(String[] args){
        int a= 10;
        int b= 20;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("afterswapping:" +a);
        System.out.println("afterswapping:" +b);
    }
}
