package player;

import player.Player;

import java.util.Comparator;

public class ScoreComparator implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Player p1 = (Player) o1;
        Player p2 = (Player) o2;

        if (p1.getPlayerScore() == p2.getPlayerScore()) {
            return 0;
        } else if (p1.getPlayerScore() < p2.getPlayerScore()) {
            return 1;
        }
            return -1;
        }
    }