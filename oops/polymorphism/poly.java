
// in polymorphism in java that allows objects to behave diffrently based on their specific class type.
// poly(many)and morph(forms).
// same method or boject behave differently based on the context.
// key features: 

// multiple behaviores: -- 
// mehtod orverriding: -- a child class can redefine a mehod of its parent class,over ride the prent class method 
// methood overloding : --we can define multipe methods with the same name but diffrent parameters.
// runtime decision:-- at Runtime java determines which method to call depending on the objects actual class;

class preson {
   void role() {
      System.out.println(" i am prson classs");
   }
}

class father extends preson {

   void role() { // it override the parent class
      System.out.println(" i am forom father class");
   }

}

public class poly {
   public static void main(String[] args) {
      preson p = new preson();
      p.role();

   }
}
