package com.java.basics;

import java.util.Arrays;

public class AnagramCheck {
        public static boolean areAnagramCheck(String str1, String str2){
            if (str1.length()!= str2.length()){
                return false;
            }
            char[] str1chars = str1.toCharArray();
            char[] str2chars = str2.toCharArray();
            Arrays.sort(str1chars);
            Arrays.sort(str2chars);
            return Arrays.equals(str1chars,str2chars);
        }
        public static void main(String [] args){
            String str1 = "silent";
            String str2 = "listen";
            // System.out.println("Are Anagrams:" + areAnagramCheck(str1,str2));
            System.out.println(areAnagramCheck(str1,str2));
        }
    }

