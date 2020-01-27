package Algorithm.str;

import java.util.BitSet;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        int index = 0;
        BitSet set = new BitSet();
        StringBuilder stringBuilder = new StringBuilder();
        boolean isContinue = true;
        while (isContinue) {
            for (int i = 0; i < strs.length; i++) {
                String str = strs[i];
                if (str.isEmpty()) return "";
                char c = str.charAt(index);
                if (i == 0) {
                    set.set(c);
                } else {
                    if (!set.get(c)) {
                        return stringBuilder.toString();
                    } else if (i == strs.length - 1) {
                        stringBuilder.append(c);
                        set.clear();
                    }
                }
                if (index == str.length() - 1) {
                    isContinue = false;
                }
            }
            index++;
        }
        return stringBuilder.toString();
    }
}
