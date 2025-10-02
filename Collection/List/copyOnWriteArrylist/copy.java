import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// whenever we prform write opreation 
// instead of directly modifying the existing list
// CopyOnWriteArrayList is not directly modifying the original doc/list  value 
// best use for read operation in more as cmpare to write
// because it every time it create new object which is not good 

public class copy {
   public static void main(String[] args) {
      List<String> shoppingList = new CopyOnWriteArrayList<>();
      shoppingList.add("egg");
      shoppingList.add("milk");
      shoppingList.add("breads");
      shoppingList.add("veg");
      System.out.println("initial shooping list : " + shoppingList);

      for (String item : shoppingList) {
         System.out.println(item);
         /// try to modify the shoppintlist
         if (item.equals("egg")) {
            shoppingList.add("butter");
            System.out.println("added butter while running");
         }
      }
      System.out.println("updated shopping list: " + shoppingList);
   }

}
