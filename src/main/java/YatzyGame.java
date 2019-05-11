import java.util.ArrayList;
import java.util.Scanner;

class YahtzeeGame {

    private String[] playerNames;
    private int[][] categoryScores;
    private int[][] selectedCategories;
    private int[] diceArray;
    int playerScores[];
    public static void main(String[] args) {
        YahtzeeGame y = new YahtzeeGame();
        y.run();
    }

    public void run() {
        setupGame();

            for (int j = 1; j <= 2; j++) {
                for (int i = 1; i <= 16; i++) {
                firstRollDice(j);
                secondAndThirdRollDice(j);
                selectAndSetCategoryScore(j, diceArray);
            }
        }
        decideWinner();
    }

    private void setupGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the names of  2 players");
        playerNames = new String[2];
        for (int i = 1; i <= 2; i++) {
            playerNames[i - 1] = sc.next();
        }

        categoryScores = new int[3][17];
        selectedCategories = new int[3][17];
        diceArray = new int[5];
        playerScores=new int[3];
    }


    private void firstRollDice(int j) {
        System.out.println(playerNames[j - 1] + "'s turn. Click 'Roll Dice' button to roll the dice.");
        for (int l = 0; l < 5; l++) {              // 5 dice each turn
            int diceRollNumber = (int) (Math.random() * 6 + 1);
            diceArray[l] = diceRollNumber;
        }
        for (int i : diceArray)
            System.out.println(i);
    }


    private void secondAndThirdRollDice(int p) {
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

    private void selectAndSetCategoryScore(int playerNumber, int[] diceArray) {
        System.out.println("Select a Category for this roll.");
        Scanner sc = new Scanner(System.in);
        int category = sc.nextInt();

                if (selectedCategories[playerNumber][category] == 1) {
                    System.out.println("Please select another category !!,already choosen");
                    System.out.println(selectedCategories[playerNumber][category]);
                }

                if (category == 1) {
                    OnesCategory onesCategory = new OnesCategory();
                    categoryScores[playerNumber][category] = onesCategory.score(diceArray);
                    playerScores[playerNumber] =  playerScores[playerNumber]+categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }

                if (category == 2) {
                    TwosCategory twosCategory = new TwosCategory();
                    categoryScores[playerNumber][category] = twosCategory.score(diceArray);
                    playerScores[playerNumber] = playerScores[playerNumber] +categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 3) {
                    ThreesCategory threesCategory = new ThreesCategory();
                    categoryScores[playerNumber][category] = threesCategory.score(diceArray);
                    playerScores[playerNumber] =  playerScores[playerNumber]+categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 4) {
                    FoursCategory foursCategory = new FoursCategory();
                    categoryScores[playerNumber][category] = foursCategory.score(diceArray);
                    playerScores[playerNumber] = playerScores[playerNumber] +categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 5) {
                    FiveCategory fiveCategory = new FiveCategory();
                    categoryScores[playerNumber][category] = fiveCategory.score(diceArray);
                    playerScores[playerNumber] = playerScores[playerNumber] +categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 6) {
                    SixCategory sixCategory = new SixCategory();
                    categoryScores[playerNumber][category] = sixCategory.score(diceArray);
                    playerScores[playerNumber] = playerScores[playerNumber] +categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 7) {
                    ChanceCategory chanceCategory = new ChanceCategory();
                    categoryScores[playerNumber][category] = chanceCategory.score(diceArray);
                    playerScores[playerNumber] =  playerScores[playerNumber]+categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 9) {
                    YatzyCategory yatzyCategory = new YatzyCategory();
                    categoryScores[playerNumber][category] = yatzyCategory.score(diceArray);
                    playerScores[playerNumber] = playerScores[playerNumber] +categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 10) {
                    ScorePair scorePairCategory = new ScorePair();
                    categoryScores[playerNumber][category] = scorePairCategory.score(diceArray);
                    playerScores[playerNumber] = playerScores[playerNumber] +categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 11) {
                    Two_Pair two_pair = new Two_Pair();
                    categoryScores[playerNumber][category] = two_pair.score(diceArray);
                    playerScores[playerNumber] = playerScores[playerNumber] +categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 12) {
                    ThreeOfAKindCategory threeOfAKindCategory = new ThreeOfAKindCategory();
                    categoryScores[playerNumber][category] = threeOfAKindCategory.score(diceArray);
                    playerScores[playerNumber] =  playerScores[playerNumber]+categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 13) {
                    FourOfAKindCategory fourOfAKindCategory = new FourOfAKindCategory();
                    categoryScores[playerNumber][category] = fourOfAKindCategory.score(diceArray);
                    playerScores[playerNumber] =  playerScores[playerNumber]+categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 14) {
                    SmallStraight smallStraight = new SmallStraight();
                    categoryScores[playerNumber][category] = smallStraight.score(diceArray);
                    playerScores[playerNumber] =  playerScores[playerNumber]+categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 15) {
                    LargeStraight largeStraight = new LargeStraight();
                    categoryScores[playerNumber][category] = largeStraight.score(diceArray);
                    playerScores[playerNumber] =  playerScores[playerNumber]+categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
                if (category == 16) {
                    FullHouse fullHouse = new FullHouse();
                    categoryScores[playerNumber][category] = fullHouse.score(diceArray);
                    playerScores[playerNumber] =  playerScores[playerNumber]+categoryScores[playerNumber][category];
                    selectedCategories[playerNumber][category] = 1;
                }
            }


    private void decideWinner() {
        int highestSoFar = 0;
        int winningPlayer = 0;
        for (int i = 1; i <= 2; i++) {
            if (highestSoFar < playerScores[i]) {
                highestSoFar = playerScores[i];
                winningPlayer = i;
            }

            System.out.println("Congratulations, " + playerNames[winningPlayer] +
                               " you are the winner with " + playerScores[winningPlayer] +
                               " points.");
        }
    }
}