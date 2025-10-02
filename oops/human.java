
public class human {
   private int age;
   private String name;

   // because in java by defauld is build this constructor is not need to build
   // public human(int age, String name) {
   // this.age = age;
   // this.name = name;
   // }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public static void main(String[] args) {

      human obj = new human();
      // human obj = new human(12, "ramsigh"); // this is called with constructor
      obj.setAge(12);
      obj.setName("rama");

      System.out.println(obj.getName() + "  : " + obj.getAge());
   }

}
