public class FoursCategory implements YatzyCategories {

    public int score(int... dice) {
        int sum = 0;
        for (int i:dice) {
            if (i == 4) {
                sum=sum+4;
            }
        }
        return sum;
    }
}
