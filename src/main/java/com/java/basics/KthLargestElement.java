package com.java.basics;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(k);
        for (int num:arr){
            heap.add(num);
            if(heap.size()>k){
                heap.poll();
            }
        }
        return heap.peek();
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        int KthLargest = findKthLargest(arr,k);
        System.out.println("kth Largest Element is:" + KthLargest);
    }
}
