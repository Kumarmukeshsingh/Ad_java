
class A { // A is parent class and parent class extend with object
   public A() {
      System.out.println("i am form default A  ");
   }

   public A(int n) {

      System.out.println(" i am form parameterize constructor of A ");
   }

}

class B extends A {
   public B() {
      System.out.println(" i am from default B ");
   }

   public B(int n) {
      this();// this method call constructor of same claass
      // super()  super method is call  the constructor of the super class just like parent class
      System.out.println(" i am form parameterize constructor of B ");
   }
}

public class demo1 {
   public static void main(String[] args) {
      B obj = new B(3);

   }
}
