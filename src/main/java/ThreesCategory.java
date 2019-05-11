public class ThreesCategory implements YatzyCategories {
    public int score(int... dice) {
        int sum = 0;
        for (int i : dice) {
            if (i == 3) {
                sum =sum+3;
            }
        }
        return sum;

    }
}