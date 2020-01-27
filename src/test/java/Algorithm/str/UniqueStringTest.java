package Algorithm.str;


import Algorithm.str.UniqueString;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueStringTest {

    private final UniqueString uniqueString = new UniqueString();

    @Test
    public void isStringUnique_1() {
        String s = "aab";
        boolean stringUnique = uniqueString.isStringUnique(s);
        assertFalse(stringUnique);
    }

    @Test
    public void isStringUnique_2() {
        String s = "ab";
        boolean stringUnique = uniqueString.isStringUnique(s);
        assertTrue(stringUnique);
    }
}