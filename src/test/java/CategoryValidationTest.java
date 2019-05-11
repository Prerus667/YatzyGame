import junit.framework.TestCase;

public class CategoryValidationTest extends TestCase {

    public void testValidateChoice() {

        // to check if the user passes any invalid category then it returns false otherwise true
        assertEquals(false,new CategoryValidation().validateChoice(-1));
        assertEquals(false,new CategoryValidation().validateChoice(61));
        assertEquals(false,new CategoryValidation().validateChoice(0));
        assertEquals(false,new CategoryValidation().validateChoice(16));


    }
}