package com.java.basics;

public class Array3DString {
    public static void main(String[] args) {
        String [][][] cars ={
                {{"City","Black"},{"Accora","Silver"},{"Amaze","White"}},
                {{"Punch","Blue"},{"Safari","White"},{"Herrier","Black"}},
                {{"Creta","White"},{"I20","Blue"},{"Verna","Black"}}
        };
        for (int i=0; i<cars.length; i++){
            if (i == 0){
                System.out.println("Honda Car Models :");
            } else if (i == 1) {
                System.out.println("TATA Car Models :");
            } else if (i == 2) {
                System.out.println("Hyundai Car Models :");
            }
            for (int j=0; j<cars[i].length; j++){
                for (int k=0; k<cars[i][j].length; k++){
                    if (k == 0){
                        System.out.println("model :"+cars[i][j][k]);
                    }else if(k == 1){
                        System.out.println("Colour :"+cars[i][j][k]);
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
