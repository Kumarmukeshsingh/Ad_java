import java.util.LinkedHashMap;

public class LruCash<K, V> extends LinkedHashMap<K, V> {

   private int capacity;

   public LruCash(int capacity) {
      super(capacity, 0.75f, true);
      this.capacity = capacity;
   }

   @Override
   protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
      return size() > capacity;
   }

   public static void main(String[] args) {

      LruCash<String, Integer> studentMap = new LruCash<>(3);
      studentMap.put("bob", 99);
      studentMap.put("alice", 89);
      studentMap.put("ram", 91);
      studentMap.put("vipul", 89); // if the we add more than of the capacity the remove the first time insert value
      // studentMap.put("bob", 900); 
      System.out.println(studentMap);

   }
}
