package categories;

import junit.framework.TestCase;

public class FiveCategoryTest extends TestCase {

    public void testScore() {
        assertEquals(25,new FiveCategory().score(5,5,5,5,5));
        assertEquals(20,new FiveCategory().score(1,5,5,5,5));
        assertEquals(5,new FiveCategory().score(1,1,4,1,5));
        assertEquals(15,new FiveCategory().score(2,5,5,5,6));
        assertEquals(0,new FiveCategory().score(2,3,4,1,6));
        assertEquals(10,new FiveCategory().score(5,3,4,5,6));
    }
}