package YatzyGameCategories;

public class OnesCategory extends Categories {

    public int score(int... dice) {
        int sum = 0;
        for (int i:dice) {
            if (i == 1) {
                sum++;
            }
        }
        return sum;
    }

    public String getName() {
        return "Ones";
    }
}
