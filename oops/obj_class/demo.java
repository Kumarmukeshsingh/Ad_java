
class laptop {
   String model;
   int price;

   public String toString() {
      return model + " : " + price;
   }

}

public class demo {
   public static void main(String[] args) {
      laptop obj = new laptop();
      obj.model = "mac air";
      obj.price = 1000;

      System.out.println(obj);
   }
}
