import java.util.PriorityQueue;

public class priorityQueueDemo {
   public static void main(String[] args) {
      // part of the queue interface;
      // order based on natural ordering (first lower);
      // custom comprator for costomized
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      pq.add(15);
      pq.add(30);
      pq.add(34);
      System.out.println(pq);
      while (!pq.isEmpty()) { // not sorted
         System.out.println(pq.poll());
      }

      // internal work 
      // priority queue is implemented as a min-heap(parent < child)  by default (natural order)
   }
}
