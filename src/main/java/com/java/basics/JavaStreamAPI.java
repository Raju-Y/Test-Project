package com.java.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 public class JavaStreamAPI {
    public static void main(String [] args){
        List<String>list = Arrays.asList("apple", "banana", "mango", "melon", "mulbery");
        List<String>resultlist = list.stream()
                .filter(S->S.startsWith("m"))
                .map(String:: toUpperCase)
                .collect(Collectors.toList());
        System.out.println(resultlist);

    }
}
