import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class setDemo {

   // set is a collection that can not contain duplicate value
   // it is faster
   // map - hashmap, linkedmap , treemap , enumam;
   // set - HashSet, linkedhashSet, TreeSet, EnumSet
   public static void main(String[] args) {
      Set<Integer> set = new HashSet<>();// no duplicate but unorder store
      LinkedHashSet<Integer> LHS = new LinkedHashSet<>();// no duplicate but maintain insertion order;
      TreeSet<Integer> ts = new TreeSet<>(); // no duplicate and store in sorted order (asending);
      // this collecton is not thread sefty

      // how to create thread safety

      Set<Integer> integers = Collections.synchronizedSet(set); // there is a thread safety. // it is time consumtion is
                                                                // high

      ConcurrentSkipListSet<Integer> set2 = new ConcurrentSkipListSet<>();// this is build in thread safety collection

   }
}
