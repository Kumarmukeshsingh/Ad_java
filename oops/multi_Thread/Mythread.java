class mythread1 extends Thread {
   public void run() {
      System.out.println(" thread1  is running ");
   }
}

class mythread2 extends Thread {
   public void run() {
      System.out.println(" thred 2 is running");
   }
}

public class Mythread {
   public static void main(String[] args) {
      mythread1 t1 = new mythread1();
      mythread2 t2 = new mythread2();

      t1.start();
      t2.start();

   }
}