package multiThread.exacuter;
public class threadpool {

   private int value = 0;
   private boolean available = false;

   public synchronized void produce(int newValue) {
      while (available) {
         try {
            wait(); // Wait until the resource is consumed
         } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
         }
      }
      value = newValue;
      available = true;
      System.out.println("Produced: " + value);
      notify(); // Notify the consumer
   }

   public synchronized void consume() {
      while (!available) {
         try {
            wait(); // Wait until the resource is produced
         } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
         }
      }
      System.out.println("Consumed: " + value);
      available = false;
      notify(); // Notify the producer
   }

   public class ThreadCommunicationExample {
      public static void main(String[] args) {
         SharedResource resource = new SharedResource();

         Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
               resource.produce(i);
            }
         });

         Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
               resource.consume();
            }
         });

         producer.start();
         consumer.start();
      }
   }

}
