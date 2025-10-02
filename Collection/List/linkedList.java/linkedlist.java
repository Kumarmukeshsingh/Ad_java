package List.linkedList.java;

import java.util.Arrays;
import java.util.LinkedList;

public class linkedlist {

   // lisked list store value and address
   // implement the list interface
   // pointer : two pointer one poiner
   public static void main(String[] args) {
      LinkedList<Integer> linkedList = new LinkedList<>();
      linkedList.add(10);
      linkedList.add(20);
      linkedList.add(11);
      linkedList.addFirst(8);
      linkedList.addLast(3);
      linkedList.remove();
      linkedList.add(1, 50);
      linkedList.removeIf(x -> x % 2 == 0);
      System.out.println(linkedList);

      LinkedList<String> animals = new LinkedList<>(Arrays.asList("Cat", "dog", "elephant"));
      System.out.println(animals);
      LinkedList<String> animalstoRemove = new LinkedList<>(Arrays.asList("dog", "Cat"));
      animals.removeAll(animalstoRemove);
      System.out.println(animals);
   }

}
