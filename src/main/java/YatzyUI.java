import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class YatzyUI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the first player");
        String firstPlayerName = scanner.next();
        System.out.println("Enter the name of the second player");
        String secondPlayerName = scanner.next();
        Player p1 = new Player(firstPlayerName);
        Player p2 = new Player(secondPlayerName);
        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        int score = 0;

        for(Player p:players) {
            for (int i = 1; i <=15; i++) {
                p.firstRollDice();
                p.secondAndThirdRollDice();
                p.selectAndSetCategoryScore();
            }
        }
        Collections.sort(players, new ScoreComparartor());
        Player winner = players.remove(1);
        System.out.println("Following is the winner of the game :" + winner.getPlayerName() + " with the score : " + winner.getPlayerScore());
    }
}