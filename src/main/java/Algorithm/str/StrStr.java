package Algorithm.str;

public class StrStr {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.length() < needle.length()) return -1;
        if (haystack.equals(needle)) return 0;
        int firstIndex = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int needleIndex = 0;
                firstIndex = i;
                if (haystack.length() < i + needle.length()) {
                    return -1;
                }
                for (int j = i; j < i + needle.length(); j++) {
                    if (haystack.charAt(j) != needle.charAt(needleIndex++)) {
                        firstIndex = -1;
                        break;
                    }
                }
                if (firstIndex != -1) {
                    break;
                }
            }
        }
        return firstIndex;
    }
}
