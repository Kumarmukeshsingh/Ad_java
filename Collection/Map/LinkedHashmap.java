import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
// this is not a thread septy 
public class LinkedHashmap {
   public static void main(String[] args) {
      LinkedHashMap<String, Integer> linkedhashMap = new LinkedHashMap<>();// double liked list
      linkedhashMap.put("orange", 10);
      linkedhashMap.put("Mango", 11);
      linkedhashMap.put("apple", 12);
      linkedhashMap.put("luchi", 15);

      System.out.println(linkedhashMap.get("Mango"));

      for (Map.Entry<String, Integer> entry : linkedhashMap.entrySet()) {
         System.out.println(entry.getKey() + " :" + entry.getValue());
      }

      HashMap<String, Integer> hashMap = new HashMap<>();

      LinkedHashMap linkedHashMap2 = new LinkedHashMap<>(hashMap);

      hashMap.put("ram", 2);
      hashMap.put("ram sing", 3);
      hashMap.put("mukesh", 10);

      Integer res = hashMap.getOrDefault("mukesh", 0);
      System.out.println(res);

      hashMap.putIfAbsent("ram", 22);
      System.out.println(hashMap);

   }
}