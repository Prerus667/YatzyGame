package YatzyCategories;

import YatzyCategories.ChanceCategory;
import junit.framework.TestCase;

public class ChanceCategoryTest extends TestCase {

    public void testScore() {
        assertEquals(15,new ChanceCategory().score(1,2,3,4,5));
    }
}