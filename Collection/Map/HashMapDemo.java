// java map is an object that maps keys to value. it connot contain duplicate key and each key can map to at most one value.
// map is a interface
// keyvalue Pair
// unique key
// one value par key 
//order : 
// put only one null value 
//if you entr the same key then in map replace the value that exist in that key
// O(1) time complexity

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
   public static void main(String[] args) {
      HashMap<Integer, String> hashMap = new HashMap<>();
      hashMap.put(1, "ram");
      hashMap.put(2, "mukesh");
      hashMap.put(4, "priyanka");
      System.out.println(hashMap);
      String s = hashMap.get(2);
      System.out.println(s);

      System.out.println(hashMap.containsKey(2));
      System.out.println(hashMap.containsValue("ram"));
// how to itrate  hasmap 
      for (int i : hashMap.keySet()) {
         System.out.println(hashMap.get(i));
      }

      Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
      // 2nd method to itrate the map 
      for (Map.Entry<Integer, String> entry : entries) {
         System.out.println(entry.getKey() + ":" + entry.getValue());
         entry.setValue(entry.getValue().toUpperCase());
      }
      System.out.println(hashMap);

      hashMap.remove(2);
       

      // buket: store the hash value in a key valu pair 
      // hash function : -- it is an algorithm that take an input(or key) ans return a fixed-sise string of bytes,typically a numerical value.the output is known as hash code , hash value or has . 
      // the primary purpose of a hash function is to map data of arbitrary size to data fixed size

      // deteministic : same input will be produced the same output.
      // fixed output size: regardless of the input size, the hash code has a consistent size eg: (32-bit,64-bit).
      // efficeint Computations: the hash function should compute the hash quickly.
      
   }

}