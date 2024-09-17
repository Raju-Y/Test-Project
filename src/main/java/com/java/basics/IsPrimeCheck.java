package com.java.basics;

public class IsPrimeCheck {
    public static void main(String [] args){
        int num = 29;
        boolean isprime = true;
        for (int i = 2; i<=Math.sqrt(num); i++){
        if(num% i==0){
            isprime = false;
            break;
        }
        }
        System.out.println(num + "is prime:" + isprime);
    }
}
