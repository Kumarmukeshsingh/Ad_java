import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {

   // no hasing 
   // array size same as  enum size 
   // index is use
   // faster than hashmap
   // memory effecient.
   public static void main(String[] args) {
      Map<Day, String> map = new EnumMap<>(Day.class);
      map.put(Day.TUESDAY,"Gym");
      map.put(Day.MONDAY,"walking");
      String s = map.get(Day.TUESDAY);
      System.out.println(s);
      System.out.println(map);
   }
}

enum Day {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}