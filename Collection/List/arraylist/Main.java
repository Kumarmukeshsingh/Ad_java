// package List.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//  order collection and duplicat allow  
// arraylist is a resizable array implementation of the list interface. unlike arrys in java which have a fixed size and arraylist can change the size dinamically as elements are added or removed. this flexibilit marks it a popular choice when the number of elements in a list isn't know in advance.

// time complixity get O(1) , average case O(n) remove O(n) iteration O(n);

public class Main {
   public static void main(String[] args) {
      // default arraylist size = 10;
      // increase arraylist capacity 1.5 x times
      // is not automatic shrink / reduce size;
      // ArrayList<Integer> list = new ArrayList<>();// inter arraylist
      // list.add(2);
      // list.add(3);
      // list.add(4);
      // list.remove(0);// remove accounding to index number
      // list.add(1, 20); // add at any specfic index
      // list.set(1,50); // it replce the value in a index;

      // for (int x : list) {
      // System.out.println(x);
      // }

      // 2nd method
      List<String> list = Arrays.asList("ram", "shyam");
      // System.out.println(list.getClass().getName());
      list.set(1, "radha");
      // System.out.println(list.get(1));

      // 3rd method
      String[] arr = { "apple", "banana", "cherry" };
      List<String> list2 = Arrays.asList(arr);
      // System.err.println(list2.getClass().getName());

      // 4th method

      // List<Integer> list3 = new ArrayList<>();
      // list3.add(3);
      // list3.add(4);
      // list3.add(3);
      // list3.add(6);
      // list3.remove(Integer.valueOf(1)); // this remove the first occurence of value
      // ( remove the acoudint to vlaue not
      // // acouding to indx number).
      // List<Integer> list4 = List.of(1, 2, 3, 4);// unmodifiable
      // // list3.set(1, 5); // cant set

      // // we can add the another list
      // list4.addAll(list3);
      // System.out.println(list4);

      // conver list ot arry

      List<Integer> list3 = new ArrayList<>();
      list3.add(3);
      list3.add(4);
      list3.add(1);
      list3.add(6);
      // Object[] array = list3.toArray();
      // Integer[] arr1 = list3.toArray(new Integer[0]);

      // Collections.sort(list3);
      list3.sort(null);
      System.out.println(list3);

   }

}
