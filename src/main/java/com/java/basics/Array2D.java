package com.java.basics;

import java.util.concurrent.Callable;

public class Array2D {
    public static void main(String[] args) {
        String[][] CelebritiesCouple = {
                {"Upasana, Ram Charan"},
                {"Radhika, Ananth Ambani"},
                {"Anushka, Virat"},
                {"Anjali, Tendulkar"}
        };
        for (int i = 0; i < CelebritiesCouple.length; i++) {
            for (int j = 0; j < CelebritiesCouple[i].length; j++) {
                System.out.print(CelebritiesCouple[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("Updated Couple Names");
        System.out.println("--------------------");
        CelebritiesCouple[0][0] = "RamCharan, Upasana";
        CelebritiesCouple[1][0] = "Ananth Ambani, Radhika";
        CelebritiesCouple[2][0] = "Virat, Anushka";
        CelebritiesCouple[3][0] = "Tendulkar, Anjali";

        for (int i = 0; i < CelebritiesCouple.length; i++) {
            for (int j = 0; j < CelebritiesCouple[i].length; j++) {
                System.out.print(CelebritiesCouple[i][j] + " ");
            }
            System.out.println();


        }
    }
}

