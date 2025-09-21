package praper.google.string.palindrome2;

import java.util.logging.Logger;

class Solution {

    private static Logger logger = Logger.getLogger(Solution.class.getName());

    public boolean validPalindrome(String s) {
        if (s == null || s.isEmpty()) {return false;}
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (isEqualsIgnoreCaseCharAt(left, right, s)) {
                left++;
                right--;
            } else {
                if (isPalindrome(left + 1, right, s)) {
                    return true;
                }
                return isPalindrome(left, right - 1, s);
            }
        }
        return true;
    }

    private static boolean isPalindrome(int leftIndex, int rightIndex, String s) {
        while (leftIndex < rightIndex) {
            if (isEqualsIgnoreCaseCharAt(leftIndex, rightIndex, s)) {
                leftIndex++;
                rightIndex--;
            } else {
                return false;
            }
        }
        return true;
    }

    private static boolean isEqualsIgnoreCaseCharAt(int leftIndex, int rightIndex, String s) {
        return s.charAt(leftIndex) == s.charAt(rightIndex);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        logger.info(String.valueOf(solution.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga")));
        logger.info(String.valueOf(solution.validPalindrome("abc")));
        logger.info(String.valueOf(solution.validPalindrome("deeee")));
        logger.info(String.valueOf(solution.validPalindrome("eeeed")));
        logger.info(String.valueOf(solution.validPalindrome("aba")));
        logger.info(String.valueOf(solution.validPalindrome("abca")));
    }
}