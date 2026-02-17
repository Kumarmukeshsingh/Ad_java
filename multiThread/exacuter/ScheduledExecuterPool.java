
import java.util.concurrent.*;

public class ScheduledExecuterPool {
   public static void main(String[] args) {
      try (ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(6,
            new ThreadFactory() {
               @Override
               public Thread newThread(Runnable r) {
                  System.out.println(" ");
                  return new Thread(r, "thread " + System.nanoTime());
               }
            })) {
         System.out.println("Starting main thread " + Thread.currentThread().getName());

         scheduledThreadPoolExecutor.schedule(new Runnable() {

            @Override
            public void run() {
               System.out.println(" Starting Tasks" + Thread.currentThread().getName());
               try {
                  Thread.sleep(40000);

               } catch (InterruptedException e) {
                  throw new RuntimeException(e);
               }
               System.out.println("Ending Tasks" + Thread.currentThread().getName());
            }
         }, 4, TimeUnit.SECONDS);
      }
      System.out.println("Ending Tasks" + Thread.currentThread().getName());
   }
}
