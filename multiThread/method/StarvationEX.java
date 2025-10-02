public class StarvationEX {
   public static void main(String[] args) {
      final Object lock = new Object();
      Runnable highPriorityTask = () -> {
         synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + "has the lock and run indenfinitely ");
            while (true) {
               // simulating continuous task
            }
         }
      };
      Runnable lowPriorityTask = () -> {
         synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " has the lock");
         }

      };
      Thread highpriority = new Thread(highPriorityTask, "HighPriorityThread");
      Thread lowProiority = new Thread(lowPriorityTask, "LowPriorityThread");

      highpriority.setPriority(Thread.MAX_PRIORITY);
      lowProiority.setPriority(Thread.MIN_PRIORITY);

      highpriority.start();
      lowProiority.start();
   }
}
