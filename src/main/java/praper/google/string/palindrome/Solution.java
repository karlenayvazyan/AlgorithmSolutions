package praper.google.string.palindrome;

import java.util.logging.Logger;

class Solution {
    private static Logger logger = Logger.getLogger(Solution.class.getName());

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else if (!toLowerCase(s.charAt(i)).equals(toLowerCase(s.charAt(j)))) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    private static String toLowerCase(char c) {
        return String.valueOf(c).toLowerCase();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        logger.info(String.valueOf(solution.isPalindrome("0P")));
        logger.info(String.valueOf(solution.isPalindrome("A man, a plan, a canal: Panama")));
        logger.info(String.valueOf(solution.isPalindrome("race a car")));
        logger.info(String.valueOf(solution.isPalindrome(" ")));
    }
}