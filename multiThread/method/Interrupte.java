public class Interrupte {
   public static void main(String[] args) throws InterruptedException {
      Thread task = new Thread(() -> {
         try {
            for (int i = 0; i < 10000; i++) {
               System.out.println("running task " + i);
               Thread.sleep(1000);
            }

         } catch (Exception e) {
            System.out.println("execption:: while that sleeping and waiting , stop task" + e);
         }

      });

      task.start();
      System.out.println("interrupting the task");
      task.sleep(2500);
       task.interrupt();// ater 2500 milisecond interrupt the thried.
       
   }
}
