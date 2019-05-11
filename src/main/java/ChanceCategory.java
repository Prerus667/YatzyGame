public class ChanceCategory implements YatzyCategories {

    public int score(int... dice) {
        int total = 0;
        for (int i : dice) {
            total = total+i;

        }
        return total;
    }

}