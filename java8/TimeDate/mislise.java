import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

// instant 
public class mislise {
   public static void main(String[] args) {
      // long currentMiliSec = System.currentTimeMillis();
      // // System.out.println(currentMiliSec);
      // Instant now = Instant.now(d1);
      // System.out.println(now);

      Instant start = Instant.now();
      int sum = 0;
      for (int i = 0; i < 100000; i++) {
         sum = sum + i+2;
      }
      Instant end = Instant.now();

      Duration d1 = Duration.between(start, end);
      Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
      System.out.println(d1);
      System.out.println(d2);

   }

}
