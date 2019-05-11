package util;
import player.Player;
import player.ScoreComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PlayGame {
    public void startGame() {
        System.out.println("Enter the names of the players separated by comma,");
            Scanner sc = new Scanner(System.in);
            String names = sc.next();
            String[] playersName = names.split(",");
            List<Player> players = new ArrayList<>();
            for (int i = 0; i < playersName.length; i++) {
                players.add(new Player(playersName[i]));
            }
            int score = 0;
            for(int i=0;i<YatzyConstants.NO_OF_CATEGORIES;i++)
            {
            for (Player p : players) {

                    p.firstRollDice();
                    p.secondAndThirdRollDice();
                    p.selectAndSetCategoryScore();

                }

           }
            Collections.sort(players, new ScoreComparator());
            Player winner = players.remove(0);
            System.out.println("Following is the winner of the game :" + winner.getPlayerName() + " with the score : " + winner.getPlayerScore());
        }
        }

