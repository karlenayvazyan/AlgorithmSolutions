package Algorithm.cash;

import org.junit.jupiter.api.Test;

class LRUCashTest {

    private LRUCash cash = new LRUCash(3);

    @Test
    void putWhenThereAreNoDuplicatesTest() {
        cash.put("a", "1");
        cash.put("b", "2");
        cash.put("c", "3");
    }

    @Test
    void putWhenThereAreDuplicatesTest() {
        cash.put("a", "1");
        cash.put("b", "2");
        cash.put("a", "3");
    }
}