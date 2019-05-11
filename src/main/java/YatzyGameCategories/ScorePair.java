package YatzyGameCategories;

public class ScorePair extends Categories {

    public int score(int... dice) {
        int[] counts = new int[6];
        int[] diceArray=new int[5];
        int j=0;
        for(int i:dice)
        {
            diceArray[j]=i;
            j++;
        }

        counts[diceArray[0]-1]++;
        counts[diceArray[1]-1]++;
        counts[diceArray[2]-1]++;
        counts[diceArray[3]-1]++;
        counts[diceArray[4]-1]++;

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