public class YatzyCategory implements YatzyCategories{
    public int score(int... dice) {
        //Couldn't find a shorter way of going forward with this prob
        int[] counts = new int[6];
        for (int die : dice)
            counts[die-1]++;
        for (int i = 0; i != 6; i++)
            if (counts[i] == 5)
                return 50;
        return 0;

    }
}
