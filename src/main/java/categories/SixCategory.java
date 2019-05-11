package categories;

public class SixCategory extends Categories {
    public int score(int... dice) {
        int sum = 0;
        for (int i:dice) {
            if (i == 6) {
                sum=sum+6;
            }
        }
        return sum;
    }

    public String getName() {
        return "Six";
    }
}
