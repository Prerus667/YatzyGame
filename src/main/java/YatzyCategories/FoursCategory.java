package YatzyCategories;

public class FoursCategory extends Categories {

    public int score(int... dice) {
        int sum = 0;
        for (int i:dice) {
            if (i == 4) {
                sum=sum+4;
            }
        }
        return sum;
    }

    public String getName() {
        return "Fours";
    }
}
