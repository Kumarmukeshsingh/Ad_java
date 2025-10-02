
class A extends Thread {
   public void run() {
      for (int i = 0; i < 100; i++) {
         System.out.println("hiiii");
         try {
            Thread.sleep(10);

         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
}

class B extends Thread {
   public void run() {
      for (int i = 0; i < 100; i++) {
         System.out.println(" hello ..");
         try {
            Thread.sleep(10);

         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
}

public class demo {
   public static void main(String[] args) {
      A obj = new A();
      B obj2 = new B();
      // System.out.println(obj.getPriority());
      // System.out.println(Thread.MAX_PRIORITY); // maximum priority is 10

      obj.start();
      try {
         Thread.sleep(5);
      } catch (Exception e) {
         e.printStackTrace();
      }
      obj2.start();
   }

}
