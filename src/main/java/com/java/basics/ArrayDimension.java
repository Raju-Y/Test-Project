package com.java.basics;

public class ArrayDimension {
    public static void main(String[] args) {
        int[][] nums = {{10, 5, 15},
                {30, 40, 50},
                {60, 70, 80},
                {90, 100, 110}

        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        nums[0][1] = 20;
        nums[1][2] = 45;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}
