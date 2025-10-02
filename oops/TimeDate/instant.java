import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class instant {
   public static void main(String[] args) {
      // Instant now = Instant.now();
      // System.out.println(now);
      Instant start = Instant.now();
      int sum = 0;
      for (int i = 0; i < 1000000; i++) {
         sum += i + 1;
      }
      Instant end = Instant.now();

      Duration d1 = Duration.between(start, end);// play with second
      Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
      // System.out.println(d1);
      // System.out.println(d2);

      int i = d1.compareTo(d2);
      // System.out.println(i);

      LocalDate now = LocalDate.now(); // play with month year
      LocalDate then = LocalDate.of(2001, 3, 1);
      Period period = Period.between(now, then);
      System.out.println(period);

      String date = "24/04/1998";
      DateTimeFormatter dateTimeFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate parse = LocalDate.parse(date, dateTimeFormater);
      // System.out.println(parse);

      
      LocalDate localDate = LocalDate.now();
      DateTimeFormatter myformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String format = localDate.format(myformatter);
      System.out.println(format);
   }
}
