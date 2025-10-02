@FunctionalInterface

// there are three type of interface(abstract )
// in a functional inter face :- you have a only one method inside the inter
// face

// marker inter face (serialize):- in this interface don't have any method
// noramal interface : - in this type of interface have more then one method

interface A {
   void show(int a);

}

public class lemda {
   public static void main(String[] args) {
      A obj = (a) -> {

         // TODO Auto-generated method stub
         System.out.println(" i am in  show " + a);
      };

      obj.show(5);
   }
}