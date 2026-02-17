import java.util.ArrayList;
import java.util.Iterator;

public class ItreatorDemo {
   public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(11);
      list.add(12);

      Iterator<Integer> iterator = list.iterator();
      // it provide edit functionality
      while (iterator.hasNext()) {
         System.out.println(iterator.next());
         Integer num = iterator.next();
         if (num % 2 == 0) {
            iterator.remove();
         }
      }
      System.out.println(list);
      ListIterator<Integer> listIterattor = list.listIterator();


   }
}
