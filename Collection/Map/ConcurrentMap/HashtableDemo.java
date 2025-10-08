// package ConcurrentMap;
// it lagacy classs

// no null key value
// slower then hash map
// it synchronized 
// only linked list if collision
// thread safe

import java.util.Hashtable;

public class HashtableDemo {
   public static void main(String[] args) {
      Hashtable<Integer, String> hashtable = new Hashtable<>();
      hashtable.put(19, "ram");
      hashtable.put(20, "ram");
      hashtable.put(25, "ram");
      hashtable.put(30, "ram");
      System.out.println(hashtable);
   }

}
