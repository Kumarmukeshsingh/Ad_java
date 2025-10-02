
//function over loading:-   if any class and function hava a same function name but its take diffrent para meter is called function over loading 
// function over riding :- over  ride the function of parent class and it exacute child class function is know as function over riding

// 
class A {
   // public void add() {
   // System.out.println(" hello i a from A ");
   // }
   public int sum(int a, int b) {
      return a + b;
   }

   public int sum(int a) {
      return a + 1;
   }

}

class B extends A {
   // public void add() {
   // System.out.println(" hello i a from B ");
   // }

   public int sum(int a, int b) {
      return a + b + 1;
   }

   public int sum(int a) {
      return a + 4;
   }
}

public class inheritance {

   public static void main(String[] args) {
      B obj = new B();

      int ans = obj.sum(5, 5);
      System.out.println(ans);
      System.out.println(obj.sum(5));

   }
}
