package com.java.basics;

public class ArithmeticException {
    public static void main (String[] args){
        try{
            int a = 5;
            int b = a/0;
        } catch (java.lang.ArithmeticException e){
            System.out.println("Division by zero");
        }
    }
}
