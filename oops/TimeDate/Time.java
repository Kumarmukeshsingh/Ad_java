import java.time.LocalTime;

public class Time {
   public static void main(String[] args) {
      LocalTime now = LocalTime.now();
      System.out.println(now);
      LocalTime customtime = LocalTime.of(13, 30, 30);
      // System.out.println(customtime);
      String time = "15:22:11";
      LocalTime parsTime = LocalTime.parse(time);
      // System.out.println(parsTime);
      LocalTime beforTwohours = now.minusHours(2);
      System.out.println(beforTwohours);
   }

}
