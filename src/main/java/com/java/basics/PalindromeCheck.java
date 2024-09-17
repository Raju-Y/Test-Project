package com.java.basics;

public class PalindromeCheck {
    public static boolean ispalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        boolean result = ispalindrome(str);
        System.out.println("ispalindrome:" +result);
    }
}
