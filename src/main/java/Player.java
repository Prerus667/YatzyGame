public class Player {
    public String[] getPlayerNames() {
        return playerNames;
    }

    public int[][] getCategoryScores() {
        return categoryScores;
    }

    public int[][] getSelectedCategories() {
        return selectedCategories;
    }

    public void setPlayerNames(String[] playerNames) {
        this.playerNames = playerNames;
    }

    public void setCategoryScores(int[][] categoryScores) {
        this.categoryScores = categoryScores;
    }

    public void setSelectedCategories(int[][] selectedCategories) {
        this.selectedCategories = selectedCategories;
    }

    public void setDiceArray(int[] diceArray) {
        this.diceArray = diceArray;
    }

    public int[] getDiceArray() {
        return diceArray;
    }

    private String[] playerNames;
    private int[][] categoryScores;
    private int[][] selectedCategories;
    private int[] diceArray;
}
