package YatzyCategories;

public class FullHouse extends Categories {
    public int score(int... dice) {
        int[] counts = new int[6];
        int[] diceArray=new int[5];
        int j=0;
        for(int i:dice)
        {
            diceArray[j]=i;
            j++;
        }

        boolean _2 = false;
        int i;
        int _2_at = 0;
        boolean _3 = false;
        int _3_at = 0;

        counts[diceArray[0]-1] += 1;
        counts[diceArray[1]-1] += 1;
        counts[diceArray[3]-1] += 1;
        counts[diceArray[4]-1] += 1;


        for (i = 0; i != 6; i += 1)
            if (counts[i] == 2) {
                _2 = true;
                _2_at = i+1;
            }

        for (i = 0; i != 6; i += 1)
            if (counts[i] == 3) {
                _3 = true;
                _3_at = i+1;
            }

        if (_2 && _3)
            return _2_at * 2 + _3_at * 3;
        else
            return 0;
    }

    public String getName() {
        return "FullHouse";
    }
}

