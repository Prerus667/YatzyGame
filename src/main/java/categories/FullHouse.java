package categories;

public class FullHouse extends Categories {
    public int score(int... dice) {
        int[] counts = new int[6];
        boolean twoPair = false, threePair = false;
        int i,positionofTwo = 0,positionofThree = 0;
        counts[dice[0]-1] += 1;
        counts[dice[1]-1] += 1;
        counts[dice[2]-1] += 1;
        counts[dice[3]-1] += 1;
        counts[dice[4]-1] += 1;


        for (i = 0; i != 6; i += 1)
            if (counts[i] == 2) {
                twoPair = true;
                positionofTwo = i+1;
            }

        for (i = 0; i != 6; i += 1)
            if (counts[i] == 3) {
                threePair = true;
                positionofThree = i+1;
            }

        if (twoPair && threePair)
            return positionofTwo * 2 +  positionofThree * 3;
        else
            return 0;
    }

    public String getName() {
        return "FullHouse";
    }

}

