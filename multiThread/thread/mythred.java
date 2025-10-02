
public class mythred implements Runnable {

   public void run() {
      System.out.println(" current thread name : " + Thread.currentThread().getName());
      System.out.println("curent thred id name :  " + Thread.currentThread().getId());
      System.out.println("curent thred  priority:  " + Thread.currentThread().getPriority());
      System.out.println("curent thred  priority:  " + Thread.currentThread().getPriority());
      // System.out.println("curent thred context loader : " +
      // Thread.currentThread().getContextClassLoader());
   }

   public static void main(String[] args) throws InterruptedException {
      mythred t = new mythred();
      Thread t1 = new Thread(t);
      Thread t2 = new Thread(t);
      Thread t3 = new Thread(t);

      t1.start();
      t2.start();
      t3.start();

      t3.join();
   }
}