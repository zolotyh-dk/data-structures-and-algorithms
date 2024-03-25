package _1_arrays_and_strings.is_subsequense;

public class Solution {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        Solution solution = new Solution();
        System.out.printf("\"%s\" is subsequence of \"%s\": %b", s, t, solution.isSubsequence(s, t));
    }
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
