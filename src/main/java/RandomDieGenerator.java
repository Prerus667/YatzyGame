public class RandomDieGenerator {

    public int[] randomDieValueGenerator() {
        int noOfDice = 5;
        int dieValues[] = new int[noOfDice];
        for (int i = 0; i < noOfDice; i++) {
            dieValues[i] = (int) (Math.random() * 6 + 1);
        }
        return dieValues;
        }
}
