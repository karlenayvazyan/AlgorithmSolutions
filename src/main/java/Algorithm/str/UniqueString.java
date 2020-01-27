package Algorithm.str;

import java.util.BitSet;

public class UniqueString {

    public boolean isStringUnique(String s) {
        BitSet set = new BitSet(s.length());
        for (char c : s.toCharArray()) {
            if (set.get(c)) {
                return false;
            }
            set.set(c);
        }
        return true;
    }

//    public boolean isStringUnique(String s) {
//        Set<Character> characters = new HashSet<>(s.length());
//        for (char c : s.toCharArray()) {
//            if (characters.contains(c)) {
//                return false;
//            }
//            characters.add(c);
//        }
//        return true;
//    }
}
