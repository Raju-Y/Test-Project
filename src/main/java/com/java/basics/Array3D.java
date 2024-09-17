package com.java.basics;

public class Array3D {
    public static void main(String[] args) {
        int [][][] arr = {
                {{10,20,30,40},{50,60,70,80}},
                {{111,222,333},{110,120,130,140}},
                {{110,120,130,140},{150,160,170,180}}
        };
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                for(int k=0; k<arr[i][j].length; k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
