// package sortedMap;

import java.util.SortedMap;
import java.util.TreeMap;
// method :  firstKey(), lastKey(),headMap(), tailMap();
// also know as red binary tree;


public class SortedMapDemo {
   public static void main(String[] args) {
      SortedMap<Integer, String> map = new TreeMap<>((a,b)-> a-b);
      map.put(91,"vivak");
      map.put(99,"subham");
      map.put(78,"ram");
      System.out.println(map);
      map.get(99);
      // map.clear();

   }
}
