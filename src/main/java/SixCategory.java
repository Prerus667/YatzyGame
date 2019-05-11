public class SixCategory implements YatzyCategories {
    public int score(int... dice) {
        int sum = 0;
        for (int i:dice) {
            if (i == 6) {
                sum=sum+6;
            }
        }
        return sum;
    }
}
