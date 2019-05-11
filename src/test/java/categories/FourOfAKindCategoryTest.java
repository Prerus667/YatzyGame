package categories;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FourOfAKindCategoryTest extends TestCase {

    public void testScore() {
        assertEquals(4, new FourOfAKindCategory().score(1, 1, 1, 4, 1));
        assertEquals(0, new FourOfAKindCategory().score(3, 3, 3, 4, 4));
        assertEquals(12,new FourOfAKindCategory().score(3, 3, 3, 4, 3));
        assertEquals(8, new FourOfAKindCategory().score(2, 2, 2, 2, 2));
    }
}