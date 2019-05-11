package YatzyGameCategories;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScorePairTest extends TestCase {

    public void testScore() {
        assertEquals(12,new ScorePair().score(6,6,6,6,6));
        assertEquals(12,new ScorePair().score(1,6,1,6,6));
        assertEquals(2,new ScorePair().score(1,1,4,1,6));
        assertEquals(6,new ScorePair().score(2,3,5,3,6));
        assertEquals(0,new ScorePair().score(2,3,4,1,5));
        assertEquals(8,new ScorePair().score(6,3,4,5,4));

    }
}