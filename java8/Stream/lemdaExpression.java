// package Stream;
// lemda express - no return no name, no axcess modifier
// predicate == function interface ( return boolea value)

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class lemdaExpression {

   public static void main(String[] args) {
      MathOperation sum = (a, b) -> a + b;
      int res = sum.operate(2, 5);
      System.err.println(res);

      Predicate<Integer> isEven = x -> x % 2 == 0;// store boolean value function
      System.out.println(isEven.test(4));

      // functon - work something
      Function<Integer, Integer> doubleIt = x -> 2 * x;
      Function<Integer, Integer> tripleIt = x -> 3 * x;
      System.out.println(doubleIt.apply(200));
      System.out.println(doubleIt.andThen(tripleIt).apply(20));
      System.out.println(doubleIt.compose(tripleIt).apply(20));

      Function<Integer, Integer> identity = Function.identity();// retrun same as inpup if you gava input 10 output will
                                                                // be 10
      Integer res2 = identity.apply(5);
      System.err.println(res2);

      // take but not return
      Consumer<Integer> conumer = x -> System.out.println(x);
      conumer.accept(10);

      // print only / supply only
      Supplier<String> giveHello = () -> "Hello world";
      System.out.println(giveHello.get());

      // BiPredicate, BiConsumer, BiFunction
      BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
      System.out.println(isSumEven.test(5, 5));

      BiConsumer<Integer, String> biConsumer = (x, y) -> {
         System.out.println(x);
         System.out.println(y);
      };

      BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
      System.out.println(biFunction.apply("a", "bc"));

      Function<Integer, Integer> a = x -> 2 * x;

      UnaryOperator<Integer> b = x -> 2 * x;
      BinaryOperator<Integer> c = (x, y) -> x + y;

      // method reference -> use method without invoking & in place of lambda
      // expression
      List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");

      students.forEach(x -> System.out.println(x));
      students.forEach(System.out::println);// method reference

      // constructor reference
      List<String> name = Arrays.asList("a", "b", "c");
     List<MobilePhone> mobilePhoneList = names.Stream().map(x->new MobilePhone(x)).collect(Collectors.toList());
     List<MobilePhone> mobilePhoneList2 = names.Stream().map(MobilePhone::new).collect(Collectors.toList());
     

   }

}

 class MobilePhone {
   String name;

   public MobilePhone(String name) {
      this.name = name;
   }
   

}

@FunctionalInterface
interface MathOperation {
   int operate(int a, int b);

}
