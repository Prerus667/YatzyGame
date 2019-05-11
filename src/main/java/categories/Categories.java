package categories;

import java.util.HashMap;
import java.util.Map;

public abstract class Categories implements Categorical {
  public  static Map<Integer,Categories> getCategories() {

          Map<Integer, Categories> categories = new HashMap<Integer, Categories>();
          categories.put(1, new ChanceCategory());
          categories.put(2, new YatzyCategory());
          categories.put(3, new FullHouse());
          categories.put(4, new LargeStraight());
          categories.put(5, new SmallStraight());
          categories.put(6, new ScorePair());
          categories.put(7, new TwoPair());
          categories.put(8, new OnesCategory());
          categories.put(9, new TwosCategory());
          categories.put(10, new ThreesCategory());
          categories.put(11, new ThreeOfAKindCategory());
          categories.put(12, new FourOfAKindCategory());
          categories.put(13, new FoursCategory());
          categories.put(14, new FiveCategory());
          categories.put(15, new SixCategory());
          return categories;
      }
      public String getName(int key)
      {
        return getCategories().get(key).getName();
      }
  }