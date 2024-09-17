package com.java.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String[] args){
        List<Integer>list = Arrays.asList(10,20,50,20,100,65,75,15,85,45,35,20,5,105);
        List<Integer>evenNumber = list.stream()
                .filter(n->n%2 == 0)
                .map(n-> n*2)
                .sorted()
                .collect(Collectors.toList());
                System.out.println(evenNumber);
    }
}
