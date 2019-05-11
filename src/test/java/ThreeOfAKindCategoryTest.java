import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeOfAKindCategoryTest extends TestCase {

    public void testScore() {
        assertEquals(3, new ThreeOfAKindCategory().score(1, 1, 1, 4, 1));
        assertEquals(9, new ThreeOfAKindCategory().score(3, 3, 3, 4, 4));
        assertEquals(0, new ThreeOfAKindCategory().score(3, 1, 3, 4, 4));
        assertEquals(6, new ThreeOfAKindCategory().score(2, 2, 2, 2, 2));
    }
}