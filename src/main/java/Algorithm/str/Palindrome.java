package Algorithm.str;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

//    public boolean isPalindrome(String s) {
//        if (s == null || s.trim().length() == 0) return true;
//        int i = 0;
//        int j = s.length() - 1;
//        List<Character> l1 = new ArrayList<>(s.length() / 2);
//        List<Character> l2 = new ArrayList<>(s.length() / 2);
//        while (i < s.length() && j > 0 && i != j) {
//            char charI = Character.toLowerCase(s.charAt(i));
//            char charJ = Character.toLowerCase(s.charAt(j));
//            if (isContainSpecialCharacter(charI)) {
//                i++;
//            } else if (isContainSpecialCharacter(charJ)) {
//                j--;
//            } else if (charI == charJ) {
//                i++;
//                j--;
//            } else {
//                return false;
//            }
//        }
//        return true;
//    }

//    public boolean isPalindrome(String s) {
//        if (s == null || s.trim().length() == 0) return true;
//        char[] chars = s.toCharArray();
//        LinkedList<Character> characters = new LinkedList<>();
//        for (char c : chars) {
//            if (!isContainSpecialCharacter(c)) {
//                characters.add(Character.toLowerCase(c));
//            }
//        }
//        while (!characters.isEmpty()) {
//            if (characters.size() == 1) return true;
//            if (characters.pollFirst() != characters.pollLast()) {
//                return false;
//            }
//        }
//        return true;
//    }

    public boolean isPalindrome(String s) {
        if (s == null || s.trim().length() == 0) return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < s.length() && j > 0 && i != j) {
            char charI = Character.toLowerCase(s.charAt(i));
            char charJ = Character.toLowerCase(s.charAt(j));
            if (isContainSpecialCharacter(charI)) {
                i++;
            } else if (isContainSpecialCharacter(charJ)) {
                j--;
            } else if (charI == charJ) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isContainSpecialCharacter(char c) {
        return !Character.isLetterOrDigit(c);
    }
}
