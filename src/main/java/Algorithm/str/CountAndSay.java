package Algorithm.str;

public class CountAndSay {

    public String countAndSay(int n) {
        if (n == 1) return "1";
        String s = countAndSay(n - 1);
        if (s.length() == 1) return "11";
        return genNext(s);
    }

    private String genNext(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = 1;
        int count = 1;
        StringBuilder result = new StringBuilder();
        while (j < chars.length) {
            if (chars[i] == chars[j]) {
                count++;
            } else {
                result.append(count);
                result.append(chars[i]);
                count = 1;
            }
            i++;
            j++;
        }
        result.append(count);
        result.append(chars[i]);
        return result.toString();
    }
}
