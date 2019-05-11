
import YatzyCategories.Categories;

import java.util.Map;
import java.util.Scanner;

public class Player {

    private String playerName;
    private static Map<Integer, Categories> remainingCategories = Categories.getCategories();
    private int score;
    int[] diceArray;

    private void firstRollDice(String playerName) {
        System.out.println(playerName + "'s turn. Click 'Roll Dice' button to roll the dice.");
        for (int l = 0; l < 5; l++) {              // 5 dice each turn
            int diceRollNumber = (int) (Math.random() * 6 + 1);
            diceArray[l] = diceRollNumber;
        }
        for (int i : diceArray)
            System.out.println(i);
    }

    private void secondAndThirdRollDice() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Select the dice you wish to re-roll");  // 3 turns
            System.out.println("Enter the die position separated by ,");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            String dicesToReRoll[] = s.split(",");
            int dicesReRolled[] = new int[dicesToReRoll.length];
            for (int j = 0; j < dicesToReRoll.length; j++) {
                dicesReRolled[j] = Integer.parseInt(String.valueOf(dicesToReRoll[j]));
                diceArray[dicesReRolled[j] - 1] = (int) (Math.random() * 6 + 1);
            }

            for (int k : diceArray)
                System.out.println(k);

        }
    }

    private void selectAndSetCategoryScore(int[] diceArray) {
        System.out.println("Select a Category for this roll.");
        Scanner sc = new Scanner(System.in);
        int category = sc.nextInt();
        Categories cat = remainingCategories.get(category);
        remainingCategories.remove(category);
        int score = cat.score(diceArray);

    }

    public static void main(String[] args) {
        remainingCategories.forEach((key, value) -> System.out.println(key + ":" + value.getName(key)));
        int score=0;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Select a Category for this roll.");
            Scanner sc = new Scanner(System.in);
            int category = sc.nextInt();
            Categories cat = remainingCategories.get(category);
            remainingCategories.remove(category);
            remainingCategories.forEach((key, value) -> System.out.println(key + ":" + value.getName(key)));
            score = score + cat.score(1, 2, 4, 3, 3);
            System.out.println(score);
        }
    }
}
