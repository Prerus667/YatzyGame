public class OnesCategory implements YatzyCategories{

    public int score(int... dice) {
        int sum = 0;
        for (int i:dice) {
            if (i == 1) {
                sum++;
            }
        }
        return sum;
    }
}
