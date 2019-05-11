package categories;

import junit.framework.TestCase;

public class SixCategoryTest extends TestCase {

    public void testScore() {
        assertEquals(30,new SixCategory().score(6,6,6,6,6));
        assertEquals(24,new SixCategory().score(1,6,6,6,6));
        assertEquals(6,new SixCategory().score(1,1,4,1,6));
        assertEquals(18,new SixCategory().score(2,6,5,6,6));
        assertEquals(0,new SixCategory().score(2,3,4,1,5));
        assertEquals(12,new SixCategory().score(6,3,4,5,6));
    }
}