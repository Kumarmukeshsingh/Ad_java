// package encapsulation;

// in which we bind the data members and method into a single unit .
// encapsulatin is used to hide the implemention part and show the functionality for better readability and usablity.
// it use hiding of some sencitive information.
// it use gatter and setter methods ;

// use of: data hindling, data integrity , reusability ,security
class person {

   private String name;
   private int age;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
}

// driver class
public class Test {
   public static void main(String[] args) {
      person p = new person();
      p.setName("Radha");
      p.setAge(23);
      System.out.println(p.getName());
      System.out.println(p.getAge());

   }

}
