import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class YahtzeeTest {

    @Test
    void chance() {
       assertEquals(15,new Yahtzee().chance(1,2,3,4,5));


    }

    @Test
    void yatzy() {

        assertEquals(50,new Yahtzee().yatzy(1,1,1,1,1));
        assertEquals(0,new Yahtzee().yatzy(2,2,3,3,3));
        assertEquals(0,new Yahtzee().yatzy(1,2,3,4,5));

    }

    @Test
    void ones() {
        assertEquals(4,new Yahtzee().ones(1,1,1,2,1));
        assertEquals(0,new Yahtzee().ones(2,2,2,2,2));
        assertEquals(5,new Yahtzee().ones(1,1,1,1,1));
        assertEquals(2,new Yahtzee().ones(1,1,2,3,4));
    }

    @Test
    void twos() {
        assertEquals(2,new Yahtzee().twos(1,1,1,2,1));
        assertEquals(10,new Yahtzee().twos(2,2,2,2,2));
        assertEquals(0,new Yahtzee().twos(1,1,1,1,1));
        assertEquals(0,new Yahtzee().twos(1,1,1,3,4));
    }

    @Test
    void threes() {

        assertEquals(3,new Yahtzee().threes(1,1,1,2,3));
        assertEquals(6,new Yahtzee().threes(2,2,3,3,2));
        assertEquals(0,new Yahtzee().threes(1,2,4,5,6));
        assertEquals(15,new Yahtzee().threes(3,3,3,3,3));
    }

    @Test
    void fours() {
        assertEquals(4,new Yahtzee().fours(1,2,3,4,5));
        assertEquals(8,new Yahtzee().fours(4,4,3,3,5));
        assertEquals(20,new Yahtzee().fours(4,4,4,4,4));
        assertEquals(0,new Yahtzee().fours(1,2,3,1,5));
    }

    @Test
    void fives() {
        assertEquals(5,new Yahtzee().fives(1,2,3,4,5));
        assertEquals(25,new Yahtzee().fives(5,5,5,5,5));
        assertEquals(10,new Yahtzee().fives(4,5,4,4,5));
        assertEquals(0,new Yahtzee().fives(1,2,3,1,4));
    }

    @Test
    void sixes() {
        assertEquals(0,new Yahtzee().sixes(1,2,3,4,5));
        assertEquals(18,new Yahtzee().sixes(6,4,6,6,5));
        assertEquals(6,new Yahtzee().sixes(4,6,4,4,4));
        assertEquals(30,new Yahtzee().sixes(6,6,6,6,6));
    }

    @Test
    void score_pair() {
        assertEquals(12, new Yahtzee().score_pair(1, 1, 6, 4, 6));
        assertEquals(8, new Yahtzee().score_pair(3, 3, 3, 4, 4));
        assertEquals(6, new Yahtzee().score_pair(3, 3, 3, 4, 1));
        assertEquals(6, new Yahtzee().score_pair(3, 3, 3, 3, 1));
    }

    @Test
    void two_pair() {
        assertEquals(14,new Yahtzee().two_pair(1, 1, 6, 4, 6));
        assertEquals(14,new Yahtzee().two_pair(3, 3, 3, 4, 4));
        assertEquals(0,new Yahtzee().two_pair(3, 3, 3, 4, 1));
        assertEquals(8,new Yahtzee().two_pair(3, 3, 3, 1, 1));

    }

    @Test
    void four_of_a_kind() {
        assertEquals(4, new Yahtzee().four_of_a_kind(1, 1, 1, 4, 1));
        assertEquals(0, new Yahtzee().four_of_a_kind(3, 3, 3, 4, 4));
        assertEquals(12,new Yahtzee().four_of_a_kind(3, 3, 3, 4, 3));
        assertEquals(8, new Yahtzee().four_of_a_kind(2, 2, 2, 2, 2));
    }

    @Test
    void three_of_a_kind() {
        assertEquals(3, new Yahtzee().three_of_a_kind(1, 1, 1, 4, 1));
        assertEquals(9, new Yahtzee().three_of_a_kind(3, 3, 3, 4, 4));
        assertEquals(0, new Yahtzee().three_of_a_kind(3, 1, 3, 4, 4));
        assertEquals(6, new Yahtzee().three_of_a_kind(2, 2, 2, 2, 2));

    }

    @Test
    void smallStraight() {
        assertEquals(15, new Yahtzee().smallStraight(1, 2, 3, 4, 5));
        assertEquals(15, new Yahtzee().smallStraight(3, 1, 2, 4, 5));
        assertEquals(0, new Yahtzee().smallStraight(3, 3, 3, 4, 3));
        assertEquals(0, new Yahtzee().smallStraight(1,2,4,5,6));
    }

    @Test
    void largeStraight() {
        assertEquals(20, new Yahtzee().largeStraight(6, 2, 3, 4, 5));
        assertEquals(20, new Yahtzee().largeStraight(3, 6, 2, 4, 5));
        assertEquals(0, new Yahtzee().largeStraight(1, 2, 3, 4, 5));
        assertEquals(0, new Yahtzee().largeStraight(1,2,4,5,6));
    }

    @Test
    void fullHouse() {
        assertEquals(8, new Yahtzee().fullHouse(1, 2, 2, 2, 1));
        assertEquals(0, new Yahtzee().fullHouse(1, 1, 2, 2, 5));
        assertEquals(17,new Yahtzee().fullHouse(3, 3, 3, 4, 4));
        assertEquals(0, new Yahtzee().fullHouse(1,1,1,5,6));
    }
}