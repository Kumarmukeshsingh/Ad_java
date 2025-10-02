public class Main {
   public static void main(String[] args) {
      doSomthing();
   }

   private static void doSomthing() {
      int a = 10;
      Employee employee = () -> {
         System.out.println(a);
         return "100";
      };
   }

   // System.out.println(employee.getslary());
   Employee employee2 = new Employee() {
      int x = 10;

      @Override
      public String getslary() {
         System.out.println(this.x); // it access of the x=10;
         // TODO Auto-generated method stub
         return "1000";
      }
   };

}
