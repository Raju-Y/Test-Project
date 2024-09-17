package com.java.basics;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepetative {
    public static void main(String [] args){
         String str = "SWISS";
        char nonRepetative = findNonRepetative(str);
         System.out.println("FirstNonRepetative is:" + nonRepetative);
    }
    public static char findNonRepetative(String str){
        Map<Character, Integer> characterCount = new LinkedHashMap<>();
        for(char c: str.toCharArray()){
            characterCount.put(c,characterCount.getOrDefault (c,0) +1);
        }
        for (Map.Entry<Character, Integer> entry:characterCount.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        throw new RuntimeException("NO NonRepetative CharacterFound");
    }
}
