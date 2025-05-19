package com.dictionary;

import java.util.Arrays;

public class StringUtil {
    public static boolean isPalindrome(String word) {
        String clean = word.replaceAll("\\W", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static boolean isAnagram(String word1, String word2) {
        char[] a = word1.replaceAll("\\W", "").toLowerCase().toCharArray();
        char[] b = word2.replaceAll("\\W", "").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
