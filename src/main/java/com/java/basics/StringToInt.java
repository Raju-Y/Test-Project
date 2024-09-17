package com.java.basics;

public class StringToInt {
    public static void main (String [] args){
        String number1 = "8888";
        String number2 = "2222";
        String total1 = number1 + number2;
        int num1 = Integer.valueOf(number1);
        int num2 = Integer.parseInt(number2);
        int total2 = num1+num2;
        System.out.println(total1);
        System.out.println(total2);
    }
}
