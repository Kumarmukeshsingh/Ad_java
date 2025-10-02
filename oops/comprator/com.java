import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class com {
   public static void main(String[] args) {
      // List<Integer> list = new ArrayList<>();
      // list.add(2);
      // list.add(12);
      // list.add(3);
      // list.add(90);
      // list.add(70);
      // Collections.sort(list, (a, b) -> b - a);// print in a desingh order
      // System.out.println(list);

      // Set<Integer> s = new TreeSet<>();
      // s.add(22);
      // s.add(5);
      // s.add(7);
      // s.add(9);
      // System.out.println(" before sorting" + s);
      // Set<Integer> ss = new TreeSet<>((a, b) -> b - a);
      // ss.add(22);
      // ss.add(5);
      // ss.add(7);
      // ss.add(9);
      // System.out.println(" after sorting " + ss);

      Map<Integer, String> m = new TreeMap<>();
      m.put(2, "w");
      m.put(5, "e");
      m.put(2, "a");
      m.put(10, "g");
      System.out.println(" before manual sorting :" + m);

      Map<Integer, String> mm = new TreeMap<>((a, b) -> b - a);
      mm.put(2, "w");
      mm.put(5, "e");
      mm.put(2, "a");
      mm.put(10, "g");
      System.out.println(" after manual sorting : " + mm);
   }
}