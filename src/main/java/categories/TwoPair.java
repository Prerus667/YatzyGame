package categories;

public class TwoPair extends Categories {
    public int score(int... dice) {
        int[] counts = new int[6];

        counts[dice[0]-1]++;
        counts[dice[1]-1]++;
        counts[dice[2]-1]++;
        counts[dice[3]-1]++;
        counts[dice[4]-1]++;

        int n = 0;
        int score = 0;
        for (int i = 0; i < 6; i += 1)
            if (counts[6-i-1] >= 2) {
                n++;
                score += (6-i);
            }
        if (n == 2)
            return score * 2;
        else
            return 0;
    }

    public String getName() {
        return "Two Pair";
    }
}

