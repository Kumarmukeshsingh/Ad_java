//package consumer_Interface.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerInterface {
   public static void main(String[] args) {
      // Consumer<String> consumer = s -> System.out.println(s);
      // consumer.accept("mukesh");

      Consumer<List<Integer>> listConsumer1 = li -> {
         for (Integer i : li) {
            System.out.println(i + 100);
         }
      };
      // listConsumer1.accept(Arrays.asList(2, 4, 5, 6, 7));

      Consumer<List<Integer>> listConsumer2 = li -> {
         for (Integer i : li) {
            System.out.println(i);
         }
      };
      // listConsumer2.accept(Arrays.asList(1, 2, 3, 5, 6));
    Consumer<List<Integer>>listConsumer=listConsumer2.andThen(listConsumer1);
    listConsumer.accept(Arrays.asList(1,2,4,6,7,8,5,66,77,99));
   }

}
