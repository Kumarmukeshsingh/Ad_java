import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
   // allow inset and remove both side front and rear
   // double ended queue
   public static void main(String[] args) {
      Deque<Integer> dq = new ArrayDeque<>();// faster iteration , low memory no null allowed we can also use linkelist
                                             // place of arrayDeque
                                             // no need to shift element;
      dq.addFirst(10);
      dq.addLast(20);
      dq.offerFirst(30);
      dq.offerLast(40);
      System.out.println(dq);

   }
}
