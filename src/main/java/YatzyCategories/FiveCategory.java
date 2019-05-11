package YatzyCategories;

public class FiveCategory extends Categories {
    public int score(int... dice) {
        int sum = 0;
        for (int i:dice) {
            if (i == 5) {
                sum=sum+5;
            }
        }
        return sum;
    }

    public String getName() {
        return "Fives";
    }
}
