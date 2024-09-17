package com.java.basics;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class ExtractYearFromTimeStamp {
    public static void main(String [] args){
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);
        int intyear = currentTime.getYear();
        String stryear1 = Integer.toString(intyear);
        //String stryear2 = String.valueOf(intyear);
        System.out.println(stryear1);
       // System.out.println(stryear2);
    }


}
