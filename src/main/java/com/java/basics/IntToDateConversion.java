package com.java.basics;

import java.time.LocalDate;

public class IntToDateConversion {
    public static void main(String [] args){
        int year = 2024;
        int month = 07;
        int day = 26;
        LocalDate date = LocalDate.of(year, month,day);
        System.out.println(date);
    }
}
