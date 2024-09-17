package com.java.basics;

public class FindMinElement {
    public static int findMinElement(int [] arr){
        int left = 0;
        int right = arr.length-1;
        while (left<right){
            int mid = left+(right-left)/2;
            if (arr[mid]>arr[right]) {
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int [] arr = {11,2 ,33,44,55,66,77,88,99,1};
        int min = findMinElement(arr);
        System.out.println("minimum Element is:" + min);
    }
}
