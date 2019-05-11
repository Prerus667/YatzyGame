import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ScoreComparatorTest  extends TestCase {

    public void testCompare()
    {
        String firstPlayername="Prerna";
        Player p1=new  Player(firstPlayername);
        p1.setPlayerScore(10);
        String secondPlayername="Tanu";
        Player p2=new  Player(secondPlayername);
        p2.setPlayerScore(15);
        List<Player> players=new ArrayList<Player>();
        players.add(p1);
        players.add(p2);
        Collections.sort(players,new ScoreComparartor());
       assertEquals(10, players.get(0).getPlayerScore());
       assertEquals(15, players.get(1).getPlayerScore());
    }
}
