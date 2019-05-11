public class FiveCategory implements YatzyCategories {
    public int score(int... dice) {
        int sum = 0;
        for (int i:dice) {
            if (i == 5) {
                sum=sum+5;
            }
        }
        return sum;
    }
}
