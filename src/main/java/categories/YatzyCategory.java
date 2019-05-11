package categories;

public class YatzyCategory extends Categories {
    public int score(int... dice) {

        int[] counts = new int[6];
        for (int die : dice)
            counts[die-1]++;
        for (int i = 0; i != 6; i++)
            if (counts[i] == 5)
                return 50;
        return 0;

    }

    public String getName() {
        return "Yatzy";
    }
}
