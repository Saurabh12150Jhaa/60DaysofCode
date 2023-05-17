//Longest Palindromic Substring
//Given a string s, return the longest palindromic substring in s.
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0;
        int end = 0;

        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[i - 1][j + 1])) {
                    dp[i][j] = true;
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }

        return s.substring(start, end + 1);        
    }
}