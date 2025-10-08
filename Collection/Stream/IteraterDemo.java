// package Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteraterDemo {
   public static void main(String[] args) {
      // ArrayList<Integer> list = new ArrayList<>();

      // // printing the value
      // Iterator<Integer> iterator = list.iterator();
      // while (iterator.hasNext()) {
      // System.out.println(iterator.next());
      // }

      ArrayList<Integer> number = new ArrayList<>();
      number.add(10);
      number.add(11);
      number.add(12);
      number.add(13);
      number.add(14);
      number.add(15);

      Iterator<Integer> itr = number.iterator();
      while (itr.hasNext()) {
         Integer num = itr.next();
         if (num % 2 == 0) {
            itr.remove();
         }
      }
      ListIterator<Integer> listIterator = number.listIterator();
      // while (listIterator.hasNext()) {
      // do somting
      // }
      listIterator.add(12345);

      System.out.println(number);

   }

}