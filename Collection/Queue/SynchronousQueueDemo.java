import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;



public class SynchronousQueueDemo {
   public static void main(String[] args) {
      BlockingQueue<String> queue = new SynchronousQueue<>();

      Thread porducer = new Thread(() -> {
         try {
            System.out.println("producer is waiting to transfer...");
            queue.put("hello from producer");
         } catch (Exception e) {
            // TODO: handle exception
            Thread.currentThread().interrupt();
            System.err.println("Producer was interruptd");
         }
      });
      Thread consumer = new Thread(() -> {
         try {
            System.out.println("consumer is waiting to receive...");
            String message = queue.take();
            System.out.println("consumer received: " + message);
         } catch (Exception e) {
            // TODO: handle exception
            Thread.currentThread().interrupt();
            System.err.println("consumer  was interruptd");
         }
      });
      porducer.start();
      consumer.start();
   }
}
