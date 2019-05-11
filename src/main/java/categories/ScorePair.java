package categories;

public class ScorePair extends Categories {

    public int score(int... dice) {
        int[] counts = new int[6];
        counts[dice[0]-1]++;
        counts[dice[1]-1]++;
        counts[dice[2]-1]++;
        counts[dice[3]-1]++;
        counts[dice[4]-1]++;

        int at;
            for (at = 0; at != 6; at++)
                if (counts[6 - at - 1] >= 2)


                    return (6 - at) * 2;
            return 0;
        }

    public String getName() {
        return "Score Pair";
    }
}