package categories;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoPairTest extends TestCase {

    public void testScore() {
        assertEquals(14,new TwoPair().score(1, 1, 6, 4, 6));
        assertEquals(14,new TwoPair().score(3, 3, 3, 4, 4));
        assertEquals(0,new TwoPair().score(3, 3, 3, 4, 1));
        assertEquals(8,new TwoPair().score(3, 3, 3, 1, 1));
    }
}