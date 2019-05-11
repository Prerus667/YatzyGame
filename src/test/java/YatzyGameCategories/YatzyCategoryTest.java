package YatzyGameCategories;

import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyCategoryTest extends TestCase {

    public void testScore() {
        assertEquals(50,new YatzyCategory().score(1,1,1,1,1));
        assertEquals(0,new YatzyCategory().score(2,2,3,3,3));
        assertEquals(0,new YatzyCategory().score(1,2,3,4,5));
    }
}