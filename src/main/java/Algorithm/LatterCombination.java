package Algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LatterCombination {
    private final Map<Integer, String> numberAndLettersCombinationMap = new HashMap<>();

    {
        numberAndLettersCombinationMap.put(2, "ABC");
        numberAndLettersCombinationMap.put(3, "DEF");
        numberAndLettersCombinationMap.put(4, "GHI");
        numberAndLettersCombinationMap.put(5, "JKL");
        numberAndLettersCombinationMap.put(6, "MNO");
        numberAndLettersCombinationMap.put(7, "PQRS");
        numberAndLettersCombinationMap.put(8, "TUV");
        numberAndLettersCombinationMap.put(9, "WXYZ");
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();
        char[] charArray = digits.toCharArray();

        List<String> results = new ArrayList<>();
        String firstDigitString = numberAndLettersCombinationMap.get(getAnInt(charArray[0]));
        for (char c : firstDigitString.toCharArray()) {
            results.add(String.valueOf(c).toLowerCase());
        }
        for (int i = 0; i < charArray.length - 1; i++) {
            results.clear();
            firstDigitString = numberAndLettersCombinationMap.get(getAnInt(charArray[i]));
            String secondDigitString = numberAndLettersCombinationMap.get(getAnInt(charArray[i + 1]));

            for (char first : firstDigitString.toCharArray()) {
                for (char second : secondDigitString.toCharArray()) {
                    results.add(concatedString(first, second));
                }
            }

        }
        System.out.println(results);
        return results;
    }

    private static String concatedString(char first, char second) {
        String result = String.valueOf(first) + second;
        return result.toLowerCase();
    }

    private static int getAnInt(char charValue) {
        return charValue - '0';
    }
}
