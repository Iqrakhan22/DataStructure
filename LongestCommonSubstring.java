package app;

import java.util.Arrays;

public class LongestCommonSubstring {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        for (int i = 0; i < strs.length; i++) {
            System.out.print(strs[i] + ",");
        }
        return s1.substring(0, idx);
    }

    public static void main(String[] args) {

        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}

