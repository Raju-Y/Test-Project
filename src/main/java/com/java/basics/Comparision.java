package com.java.basics;

public class Comparision {
    public static void main(String[] args){
        String str1 = "THANK YOU";
        String str2 = "THANK YOU";
        String str3 = new String  ("THANK YOU");
        System.out.println("comparision with ==:" +(str1 == str2));
        System.out.println("comparision with ==:" +(str1 == str3));
        System.out.println("comparision with.equals :" + str1.equals(str2));
        System.out.println("comparision with.equals :" + str1.equals(str3));
    }
}
