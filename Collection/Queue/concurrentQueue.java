import java.util.concurrent.ConcurrentLinkedDeque;

public class concurrentQueue {

   public static void main(String[] args) {
      // non-bloking thread safe double ended queue
      ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
      deque.add("Element");
      deque.addFirst("elemetn2");
      ConcurrentLinkedQueue<String> deque2 = new ConcurrentLinkedQueue<>();
   }
}