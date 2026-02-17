// UTC universal time 

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneTime {
   public static void main(String[] args) {
      ZonedDateTime now = ZonedDateTime.now();
      System.out.println(now);
      Set<String> getAvailableZoneIds = ZoneId.getAvailableZoneIds();
      // System.out.println(getAvailableZoneIds);
      // getAvailableZoneIds.forEach(System.out::println);
      ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
      System.out.println(" current time of new work::::" + newYorkTime);
   }
}

