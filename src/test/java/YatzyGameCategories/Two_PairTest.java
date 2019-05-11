package YatzyGameCategories;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Two_PairTest extends TestCase {

    public void testScore() {
        assertEquals(14,new Two_Pair().score(1, 1, 6, 4, 6));
        assertEquals(14,new Two_Pair().score(3, 3, 3, 4, 4));
        assertEquals(0,new Two_Pair().score(3, 3, 3, 4, 1));
        assertEquals(8,new Two_Pair().score(3, 3, 3, 1, 1));
    }
}