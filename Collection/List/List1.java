package List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

class myComprator implements Comparator<Integer> {
   public int compare(Integer o1, Integer o2) {
      return o2 - o1;
   }
}

public class List1 {

   public static void main(String[] args) {

      ArrayList<Integer> al = new ArrayList<>();
      al.add(1);
      al.add(2);
      al.add(3);
      al.add(2);
      al.remove(1);
      al.add(0, 19);
      // System.out.println(al);
      // System.out.println(al.size());
      // // List<String> al1 = Arrays.asList("ram", "shayam");
      // List<Integer> list2 = List.of(2, 3, 4, 3, 5, 3, 6, 77, 2, 2, 753, 3);
      // al.addAll(list2);
      // System.out.println(al);
      // al.remove(Integer.valueOf(1));
      al.sort(new myComprator());
      System.out.println(al);

   }
}
