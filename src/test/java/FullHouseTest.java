import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FullHouseTest extends TestCase {

    public void testScore() {
        assertEquals(8, new FullHouse().score(1, 2, 2, 2, 1));
        assertEquals(0, new FullHouse().score(1, 1, 2, 2, 5));
        assertEquals(17,new FullHouse().score(3, 3, 3, 4, 4));
        assertEquals(0, new FullHouse().score(1,1,1,5,6));
    }
}