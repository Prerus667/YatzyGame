package YatzyCategories;

public class TwosCategory extends Categories {

    public int score(int... dice) {
        int sum = 0;
        for (int i:dice) {
            if (i == 2) {
                sum=sum+2;
            }
        }
        return sum;
    }

    public String getName() {
        return "Twos";
    }
}

