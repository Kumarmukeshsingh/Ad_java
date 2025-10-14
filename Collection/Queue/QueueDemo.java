import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {

   // element are added at the end and remove from the front
   // act as linkedlist
   // queue add only add at last
   // add tail
   // remove head

   // public static void main(String[] args) {
   // Queue<Integer> ll = new LinkedList<>();
   // ll.add(10);
   // ll.add(11);
   // ll.add(101);
   // ll.add(102);
   // System.out.println(ll);
   // System.out.println(ll.size());
   // System.out.println(ll.poll());
   // System.out.println(ll.remove());// throw excptions
   // System.out.println(ll.element());// throw exeptios
   // System.out.println(ll.peek());
   // }

   public static void main(String[] args) {
      Queue<Integer> queue = new ArrayBlockingQueue<>(2);// it take size of the queue;
      queue.add(1);
      queue.add(2);
      // queue.add(4);// error queue full
      // but we can use offer() than it not gave error it return true or false
      queue.offer(3);
      System.out.println(queue);

   }
}
