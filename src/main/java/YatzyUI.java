import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class YatzyUI {

    public static void main(String[] args) {
        System.out.println("Enter the names of the players separated by comma,");
        Scanner sc = new Scanner(System.in);
        String names = sc.next();
        String[] playersName = names.split(",");
        List<Player> players=new ArrayList<>();
        for(int i=0;i<playersName.length;i++)
        {
            players.add(new Player(playersName[i]));
        }
        int score = 0;
        for(Player p:players) {
            for (int i = 1; i <=2; i++) {
                p.firstRollDice();
                p.secondAndThirdRollDice();
                p.selectAndSetCategoryScore();
            }
        }
        Collections.sort(players, new ScoreComparartor());
        Player winner = players.remove(0);
        System.out.println("Following is the winner of the game :" + winner.getPlayerName() + " with the score : " + winner.getPlayerScore());
    }
}