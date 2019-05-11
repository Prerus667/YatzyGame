package YatzyGameCategories;

public class Two_Pair extends Categories {
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

