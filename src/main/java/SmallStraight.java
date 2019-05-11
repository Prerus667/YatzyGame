public class SmallStraight implements YatzyCategories{
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
        if (counts[0] == 1 &&
            counts[1] == 1 &&
            counts[2] == 1 &&
            counts[3] == 1 &&
            counts[4] == 1)
            return 15;
        return 0;
    }
}
