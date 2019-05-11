package YatzyGameCategories;

import junit.framework.TestCase;

public class OnesCategoryTest extends TestCase {

    public void testScore() {
        assertEquals(5,new OnesCategory().score(1,1,1,1,1));
        assertEquals(2,new OnesCategory().score(1,2,1,3,3));
        assertEquals(3,new OnesCategory().score(1,1,5,1,5));
        assertEquals(0,new OnesCategory().score(2,3,4,5,6));
    }
}