package com.java.basics;

public class LargestElement {
    public static void main(String [] args){
        int [] arr = {4,13,2,9,50,23};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
        if (arr[i]>max) {
            max = arr[i];
        }
        }
        System.out.println("LargestElement is:" +max);
    }
}
