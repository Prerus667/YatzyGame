import java.util.Comparator;

public class ScoreComparartor implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Player p1 = (Player) o1;
        Player p2 = (Player) o2;

        if (p1.getScore() == p2.getScore()) {
            return 0;
        } else if (p1.getScore() < p2.getScore()) {
            return -1;

        }
            return 1;
        }
    }