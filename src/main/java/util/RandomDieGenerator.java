package util;

public class RandomDieGenerator {

    public static int[] randomDieValueGenerator(int noOfDice) {
        int dieValues[] = new int[noOfDice];
        for (int i = 0; i < noOfDice; i++) {
            dieValues[i] = (int) (Math.random() * 6 + 1);
        }
        return dieValues;
        }
}
