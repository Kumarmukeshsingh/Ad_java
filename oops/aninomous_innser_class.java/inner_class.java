
abstract class A {
   public abstract void shwo();

   public abstract void animal();
}

public class inner_class {

   public static void main(String[] args) {
      A obj = new A() {// anonymous inner class

         public void shwo() {
            // TODO Auto-generated method stub
            System.out.println(" i am from show");
         }

         public void animal() {
            // TODO Auto-generated method stub
            System.out.println(" i am from animal ");
         }
      };

      obj.shwo();
      obj.animal();
   }
}
