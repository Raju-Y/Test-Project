package com.java.basics;

public class ReverseString {
    public static String reverse(String str){
        if (str == null||str.isEmpty()){
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }
    public static void main (String[] args){
        String str = "Hello World";
        System.out.println("orginalString is," + str);
        System.out.println("ReverseString:" + reverse(str));
    }
}
