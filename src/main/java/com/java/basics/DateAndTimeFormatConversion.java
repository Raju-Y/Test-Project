package com.java.basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeFormatConversion {
    public static void main (String [] args){
        String inputDateTimeStr = "2024-07-26T09:45:25";
        DateTimeFormatter inputDateTimeFormat = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        LocalDateTime dateTime = LocalDateTime.parse(inputDateTimeStr,inputDateTimeFormat);
        DateTimeFormatter outputDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy:HH:mm:ss");
        String outputDateTimestr = dateTime.format(outputDateFormat);
        System.out.println("Converted DateTime is:" + outputDateTimestr);
    }
}
