import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
   public static void main(String[] args) {
      NavigableMap<Integer, String> navMap = new TreeMap<>();
      navMap.put(1, "one");
      navMap.put(4, "Two");
      navMap.put(5, "tree");
      System.out.println(navMap);
      System.out.println(navMap.lowerKey(4));
      System.out.println(navMap.ceilingKey(3));
      System.out.println(navMap.higherEntry(1));
      System.out.println(navMap.descendingMap());
   }
}
