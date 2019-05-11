import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargeStraightTest extends TestCase {

    public void testScore() {
        assertEquals(20, new LargeStraight().score(6, 2, 3, 4, 5));
        assertEquals(20, new LargeStraight().score(3, 6, 2, 4, 5));
        assertEquals(0, new LargeStraight().score(1, 2, 3, 4, 5));
        assertEquals(0, new LargeStraight().score(1,2,4,5,6));
    }
}