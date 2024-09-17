package com.java.basics;

public class FinalTest {
    public static void main (String [] args){
        try{
            int result = 25/5;
            System.out.println(result);
        }finally {
            System.out.println("final block executed");
        }
    }
}
