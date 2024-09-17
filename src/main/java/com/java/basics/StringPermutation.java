package com.java.basics;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "ABCD";
        generatepermutations(str, " ");
        }
        static void generatepermutations (String str, String answer){
            if (str.length() == 0) {
                System.out.println(answer);
                return;

            }
            for (int i = 0; i<str.length();i++){
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);
                generatepermutations(ros, answer + ch);
            }
        }

    }
