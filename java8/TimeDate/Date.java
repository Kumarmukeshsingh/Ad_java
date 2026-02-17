import java.time.LocalDate;

public class Date {
   public static void main(String[] args) {
      LocalDate now = LocalDate.now();
      System.out.println(now);
      LocalDate customDate = LocalDate.of(1990, 3, 7);

      // int year = now.getYear();
      // int month = now.getMonthValue();
      // int day = now.getDayOfMonth();
      // System.out.println(year + " :" + month + " :" + day);
      
      LocalDate yesterday = now.minusDays(1);
      System.out.println(yesterday);
      LocalDate pastdate = now.minusMonths(100);
      System.out.println(pastdate);
   }

}
