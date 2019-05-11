public interface YahtzeeInterface {

   int chance(int d1,int d2,int d3,int d4,int d5);
   int yatzy(int... dice);
   int ones(int d1,int d2,int d3,int d4,int d5);
    int twos(int d1,int d2,int d3,int d4,int d5);
    int threes(int d1,int d2,int d3,int d4,int d5);
    int fours(int d1,int d2,int d3,int d4,int d5);
    int fives(int d1,int d2,int d3,int d4,int d5);
    int sixes(int d1,int d2,int d3,int d4,int d5);
    int score_pair(int d1,int d2,int d3,int d4,int d5);
    int two_pair(int d1,int d2,int d3,int d4,int d5);
    int four_of_a_kind(int d1,int d2,int d3,int d4,int d5);
    int three_of_a_kind(int d1,int d2,int d3,int d4,int d5);
    int fullHouse(int d1,int d2,int d3,int d4,int d5);
    int smallStraight(int d1,int d2,int d3,int d4,int d5);
    int largeStraight(int d1,int d2,int d3,int d4,int d5);




}
