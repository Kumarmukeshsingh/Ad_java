// package List.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class comprator {

   static class StringLengthComprator implements Comparator<String> {

      @Override
      public int compare(String o1, String o2) {
         return o1.length() - o2.length();
      }

   }

   static class MyComprator implements Comparator<Integer> {

      @Override
      public int compare(Integer o1, Integer o2) {
         // return o2-o1;// return negative
         return o1 - o2;// return postive
      }

   }

   public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(2);
      list.add(1);
      list.add(3);

      // list.sort(new MyComprator());
      // using lemda
      list.sort((a, b) -> a - b);
      System.out.println(list);

      List<String> words = Arrays.asList("banan", "apple", "date");
      // words.sort(new StringLengthComprator());

      // using lemda
      words.sort((a, b) -> a.length() - b.length());
      System.out.println(words);

   }
}
