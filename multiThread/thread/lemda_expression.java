
// class A implements Runnable {
//    public void run() {
//       for (int i = 0; i <= 5; i++) {
//          System.out.println(" hii");
//          try {
//             Thread.sleep(10);
//          } catch (Exception e) {
//             // TODO: handle exception
//             e.printStackTrace();
//          }
//       }
//    }
// }

// class B implements Runnable {
//    public void run() {
//       for (int i = 0; i <= 5; i++) {
//          System.out.println(" bro ");
//          try {
//             Thread.sleep(10);
//          } catch (Exception e) {
//             // TODO: handle exception
//             e.printStackTrace();
//          }
//       }
//    }
// }

public class lemda_expression {
   public static void main(String[] args) {

      // Runnable obj=new A();
      // Runnable obj2=new B();

      Runnable obj = () -> {
         for (int i = 0; i <= 5; i++) {
            System.out.println(" hii ");
            try {
               Thread.sleep(10);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      };
      Runnable obj2 = () -> {
         for (int i = 0; i <= 5; i++) {
            System.out.println(" bro ");
            try {
               Thread.sleep(10);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      };

      Thread t1 = new Thread(obj);
      Thread t2 = new Thread(obj2);

      t1.start();
      try {
         Thread.sleep(5);
      } catch (Exception e) {
         e.printStackTrace();
      }
      t2.start();

   }

}
