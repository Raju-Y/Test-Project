package com.java.basics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatConversion {
    public static void main(String [] args){
        String inputDateStr = "2024-07-26";
        DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(inputDateStr, inputFormat);
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String outputDateStr = date.format(outputFormat);
        System.out.println("Converted Date is:" + outputDateStr);
    }
}
