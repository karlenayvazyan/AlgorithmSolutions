package Algorithm;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LatterCombinationTest {

    private final LatterCombination latterCombination = new LatterCombination();

    @Test
    public void letterCombinationsEmpty() {
        List<String> strings = latterCombination.letterCombinations("");
        assertNotNull(strings);
        assertTrue(strings.isEmpty());
    }

    @Test
    public void letterCombinations() {
        List<String> strings = latterCombination.letterCombinations("23");
        assertNotNull(strings);
        List<String> expected = List.of("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertEquals(expected, strings);
    }

    @Test
    public void letterCombinations_2() {
        List<String> strings = latterCombination.letterCombinations("2");
        assertNotNull(strings);
        List<String> expected = List.of("a","b","c");
        assertEquals(expected, strings);
    }
}