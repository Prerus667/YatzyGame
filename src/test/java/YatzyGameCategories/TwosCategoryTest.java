package YatzyGameCategories;

import junit.framework.TestCase;

public class TwosCategoryTest extends TestCase {

    public void testScore() {
        assertEquals(10,new TwosCategory().score(2,2,2,2,2));
        assertEquals(4,new TwosCategory().score(1,2,2,3,3));
        assertEquals(0,new TwosCategory().score(1,1,5,1,5));
        assertEquals(2,new TwosCategory().score(2,3,4,5,6));
    }
}