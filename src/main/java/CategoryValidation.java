import YatzyCategories.Categories;

import java.util.Map;

public class CategoryValidation {
    // This class is added to make sure that the category selected belongs to the remaining category
    Map<Integer, Categories> remainingCategories = Categories.getCategories();
    public boolean validateChoice(int category) {
        if (remainingCategories.get(category) == null) {
            return false;
        }
        return true;
    }
}
