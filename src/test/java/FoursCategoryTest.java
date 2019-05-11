import junit.framework.TestCase;

public class FoursCategoryTest extends TestCase {

    public void testScore() {
        assertEquals(20,new FoursCategory().score(4,4,4,4,4));
        assertEquals(16,new FoursCategory().score(1,4,4,4,4));
        assertEquals(0,new FoursCategory().score(1,1,5,1,5));
        assertEquals(8,new FoursCategory().score(2,4,5,4,6));
    }
}