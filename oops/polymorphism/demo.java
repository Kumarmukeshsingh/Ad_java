// package polymorphism;

class A { // if in befor decleare the class we use final keyword then this class is not
          // extendable
   public void show() {/// if we use the final key word then we can't overiding the the method
      System.out.println(" in show A");
   }
}

class B extends A {
   public void show() {// eror because in parent class A of method declare the final class so it shoe
                       // the compile error
      System.out.println(" in show B ");
   }
}

class C extends A {
   public void show() {
      System.out.println(" in show C ");
   }
}

public class demo {
   public static void main(String[] args) {

      A obj = new A();
      obj.show();
      obj = new B();
      obj.show();
      obj = new C();
      obj.show();
   }
}
