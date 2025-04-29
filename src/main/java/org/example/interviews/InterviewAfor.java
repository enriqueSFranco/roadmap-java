package org.example.interviews;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.HashMap;
import java.util.Map;

public class InterviewAfor {

    public int counterVowels(String str) {
        final Pattern VOWELS_REGEX = Pattern.compile("[aeiouáéíóúü]]", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        if (str == null || str.isBlank()) return 0;

        Matcher matcher = VOWELS_REGEX.matcher(str);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static Map<String, Object> mostRepeteadChar(String str) {
        str = str.replace("\\s+", "");

        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char maxChar = 0;
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        Map<String, Object> result = new HashMap<>();
        result.put("char", maxChar);
        result.put("count", maxCount);

        return result;
    }

    public static boolean isPalindrome(String str) {
        str = str.replace("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left <= right){
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
