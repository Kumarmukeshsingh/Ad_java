import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class BlockingQueueDemo {
   // thread safe queue
   // wait for queue to become non-empty / wait for space
   // simplify concurrenc problems like producer-customer
   // standard queue --
   // empty -- remove (no waiting);
   // blocking queue
   // put - block if q is full and wait until space becomes available
   // take- blocks if the queue is empty until an element become available
   // offer - wait for the space , up to specific timeout.

   public static void main(String[] args) {
      BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(5);
      // low memoery overhead
      // uses a single lock for both enque ans deque

      BlockingQueue<Integer> lbq = new LinkedBlockingQueue<>();
      // optionally bounded
      // use two seprate locks for enque and deque operation
      // higher concurrency between producer and customer

      BlockingQueue<String> pbq = new PriorityBlockingQueue<>();
      // binary heap as array and can grow diyamically
      // head is based on on their natural order or provided comprater like priority
      // queue.
      // put wont block
      // use inpt order
      pbq.add("apple");
      pbq.add("banana");
      pbq.add("cherry");
      System.out.println(pbq);

      BlockingQueue<Integer> sq = new SynchronousQueue<>();
       // create synchronous queue that mean element is orderd
       //each insert operation must wait for a corresponding remove operation by another thread and vice versa;
       //
   }
}
