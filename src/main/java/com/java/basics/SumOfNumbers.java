package com.java.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SumOfNumbers {
    public static void main(String[] args){
        List<Integer>numbers = Arrays.asList(2,3,7,8,6,9,5);
         int sumofSquare = numbers.stream()
                .map(n-> n*n)
                .reduce(0,Integer::sum);
        System.out.println(sumofSquare);



    }
}
