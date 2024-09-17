package com.java.basics;

public class IntToString {
    public static void main(String [] args){
        int number = 123456789;
        String num1 = String.valueOf(number);
        System.out.println("Int conversion using String.valueOf:" + num1);
        String num2 = Integer.toString(number);
        System.out.println("Int conversion using Integer.toString:" + num2);
    }
}
