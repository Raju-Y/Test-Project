package com.java.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
    public static void main(String [] args){
        List<String> fruits = Arrays.asList("Apple","Mango","Apricot","Avocado", "Ackee");
        List<String> Fruits = fruits.stream()
                .filter(s->s.startsWith("A"))
                .collect(Collectors.toList());
                     //   .toList();
        System.out.println(Fruits);
    }
}
