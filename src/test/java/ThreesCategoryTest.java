import junit.framework.TestCase;

public class ThreesCategoryTest extends TestCase {

    public void testScore() {
       assertEquals(15,new ThreesCategory().score(3,3,3,3,3));
       assertEquals(12,new ThreesCategory().score(1,3,3,3,3));
        assertEquals(0,new ThreesCategory().score(1,1,5,1,5));
        assertEquals(3,new ThreesCategory().score(2,3,4,5,6));
    }
}