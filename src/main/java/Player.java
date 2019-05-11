
import YatzyGameCategories.Categories;

import java.util.Map;
import java.util.Scanner;

public class Player {

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    private String playerName;
    Map<Integer, Categories> remainingCategories = Categories.getCategories();

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int score) {
        this.playerScore = score;
    }

    private int playerScore;

    public int[] getDiceArray() {
        return diceArray;
    }

    public void setDiceArray(int[] diceArray) {
        this.diceArray = diceArray;
    }

    int[] diceArray;

    public Player(String name)
    {
        this.playerName=name;
    }

    public void firstRollDice() {
        System.out.println(playerName + "'s turn. Click 'Roll Dice' button to roll the dice.");
        diceArray= RandomDieGenerator.randomDieValueGenerator(5);
        for (int i : diceArray)
            System.out.println(i);
    }

    public void secondAndThirdRollDice() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Select the dice you wish to re-roll");  // 3 turns
            System.out.println("Enter the die position separated by ,");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String dicesToReRoll[] = s.split(",");
            int dicesReRolled[] = new int[dicesToReRoll.length];
            for (int j = 0; j < dicesToReRoll.length; j++) {
                dicesReRolled[j] = Integer.parseInt(String.valueOf(dicesToReRoll[j]));
                diceArray[dicesReRolled[j] - 1] = RandomDieGenerator.randomDieValueGenerator(dicesReRolled.length)[j];
            }
            setDiceArray(diceArray);
            for (int k : diceArray)
                System.out.println(k);

        }
    }

    public void selectAndSetCategoryScore() {

        remainingCategories.forEach((key, value) -> System.out.println(key + ":" + value.getName(key)));
        System.out.println("Select a Category for this roll.");
        Scanner sc = new Scanner(System.in);
        int category = 0;

            category = sc.nextInt();
            Categories cat = remainingCategories.get(category);
            remainingCategories.remove(category);
            remainingCategories.forEach((key, value) -> System.out.println(key + ":" + value.getName(key)));
            //throws error if user selects a category other than values present in the remaining categories
            playerScore = playerScore + cat.score(diceArray);
            setPlayerScore(playerScore);



    }
    }


