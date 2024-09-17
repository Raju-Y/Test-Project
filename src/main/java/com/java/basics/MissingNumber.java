package com.java.basics;

public class MissingNumber {
    public static   int FindingMissingNumber(int [] arr){
        int n= arr.length;
        int totalsum = n*(n+1)/2;
        int arrsum = 0;
        for (int num:arr){
            arrsum +=num;
        }
        return  totalsum-arrsum;
    }
    public static void main(String [] args){
        int [] arr = {0,3,1,4,5};
        System.out.println("Missing Number is:" + FindingMissingNumber(arr));
    }
}
