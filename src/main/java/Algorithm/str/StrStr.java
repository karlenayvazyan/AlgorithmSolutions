package Algorithm.str;

public class StrStr {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.length() < needle.length()) return -1;
        int i = 0;
        int j = 0;
        int firstEqualsIndex = -1;
        while (i < haystack.length()) {
            if (j == needle.length()) {
                return firstEqualsIndex;
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (firstEqualsIndex == -1)
                    firstEqualsIndex = i;
                i++; j++;
            } else if (haystack.charAt(i) == needle.charAt(0)) {
                firstEqualsIndex = i;
            } else {
                firstEqualsIndex = -1;
                i++;
                j = 0;
            }
        }
        return firstEqualsIndex;
    }
}
