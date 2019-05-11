package util;

public class InputValidation {

    public static boolean validateUserInput(String[] diceArray) {
        try {
            int count = 0;
            int dicesReRolled[] = new int[diceArray.length];
            for (int i = 0; i < diceArray.length; i++) {
                dicesReRolled[i] = Integer.parseInt(String.valueOf(diceArray[i]));
            }
            for (int i = 0; i < diceArray.length; i++) {
                if (dicesReRolled[i] == 1 || dicesReRolled[i] == 1 || dicesReRolled[i] == 2 || dicesReRolled[i] == 3 || dicesReRolled[i] == 4 || dicesReRolled[i] == 5) {
                    count++;
                }

            }
            if (count == 0) {
                System.out.println("Invalid choice please enter again!!!");
                return false;
            }
            return true;
        } catch (Exception e) {
            System.out.println("Invalid choice please enter again!!!");
            return false;

        }
    }

}
