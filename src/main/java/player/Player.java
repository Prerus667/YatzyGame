package player;

import categories.Categories;
import util.InputValidation;
import util.RandomDieGenerator;
import util.YatzyConstants;

import java.util.*;

public class Player {

    public String getPlayerName() {
        return playerName;
    }

    private String playerName;
    public Map<Integer, Categories> remainingCategories = Categories.getCategories();

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int score) {
        this.playerScore = score;
    }

    private int playerScore;


    int[] diceArray;

    public Player(String name) {
        this.playerName = name;
    }

    public void firstRollDice() {
        System.out.println(playerName + "'s turn. Click 'Roll Dice' button to roll the dice.");
        diceArray = RandomDieGenerator.randomDieValueGenerator(YatzyConstants.NO_OF_DIES);
        for (int i : diceArray)
            System.out.print("["+i+"]");
    }


    public void secondAndThirdRollDice() {
        for (int i = 0; i < 2; i++) {
            System.out.println();
            System.out.println("Select the dice you wish to re-roll");
            System.out.println("Enter the die position separated by ,");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String dicesToReRoll[] = s.split(",");
            while(InputValidation.validateUserInput(dicesToReRoll) == false) {
                s = sc.next();
                dicesToReRoll=s.split(",");
            }

                int dicesReRolled[] = new int[dicesToReRoll.length];
                for (int j = 0; j < dicesToReRoll.length; j++) {
                    dicesReRolled[j] = Integer.parseInt(String.valueOf(dicesToReRoll[j]));
                    diceArray[dicesReRolled[j] - 1] = RandomDieGenerator.randomDieValueGenerator(dicesReRolled.length)[j];
                }

            for (int k : diceArray)
                System.out.print("["+k+"]");

        }
    }

    public void selectAndSetCategoryScore() {
        System.out.println();
        remainingCategories.forEach((key, value) -> System.out.println(key + ":" + "\t"+ value.getName(key)));
        System.out.println("Select a Category for this roll.");
        Scanner sc = new Scanner(System.in);
        int category = 0;
        category = sc.nextInt();
        while(remainingCategories.get(category)==null)
        {
            System.out.println("Enter a valid category since the category supplied is invalid");
            category=sc.nextInt();

        }
        Categories cat = remainingCategories.get(category);
        remainingCategories.remove(category);
        remainingCategories.forEach((key, value) -> System.out.println(key + ":" + "\t"+value.getName(key)));
        playerScore = playerScore + cat.score(diceArray);
        setPlayerScore(playerScore);
        System.out.println("Your score for this category is "+ cat.score(diceArray));
        System.out.println("Your total score is "+ playerScore);
    }
    }


