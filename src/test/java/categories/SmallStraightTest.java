package categories;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallStraightTest extends TestCase {

    public void testScore() {
        assertEquals(15, new SmallStraight().score(1, 2, 3, 4, 5));
        assertEquals(15, new SmallStraight().score(3, 1, 2, 4, 5));
        assertEquals(0, new SmallStraight().score(3, 3, 3, 4, 3));
        assertEquals(0, new SmallStraight().score(1,2,4,5,6));
        assertEquals(0,new SmallStraight().score(4,5,6,2,1));
    }
}