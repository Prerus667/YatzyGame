package YatzyCategories;

public class ChanceCategory extends Categories {

    public int score(int... dice) {
        int total = 0;
        for (int i : dice) {
            total = total+i;

        }
        return total;
    }

    public String getName() {
        return "Chance";
    }


}