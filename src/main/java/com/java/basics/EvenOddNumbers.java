package com.java.basics;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String [] args){
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter a Number");
        int a = scn.nextInt();
        if (a%2 == 0){
            System.out.println(a+ " is EvenNumber");
        }else{
            System.out.println(a + " is OddNumber");
        }
    }
}
