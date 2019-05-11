package YatzyGameCategories;

public class ThreeOfAKindCategory extends Categories {
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
        for (int i = 0; i < 6; i++)
            if (counts[i] >= 3)
                return (i+1) * 3;
        return 0;
    }

    public String getName() {
        return "Three of a kind";
    }
}
