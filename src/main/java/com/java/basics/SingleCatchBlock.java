package com.java.basics;

public class SingleCatchBlock {
    public static void main (String [] args){
       try {
            int[] arr = new int[5];
            arr[5] = 25/0;
         } catch (java.lang.ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e. getMessage());
        }
    }
}
