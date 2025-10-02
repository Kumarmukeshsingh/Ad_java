
import java.rmi.StubNotFoundException;
import java.util.function.Function;

public class Mukesh {
   public static void main(String[] args) {
      // Function<String, Integer> function = x -> x.length();
      // System.out.println(function.apply("mukesh"));
      // Function<String, String> function2 = s -> s.substring(0, 3);
      // Function<String, String> function3 = s -> s.toUpperCase();

      // Function<String, String> SSfunction = function2.andThen(function3);
      // System.out.println(SSfunction.apply("mukesh"));

      // System.out.println(function2.andThen(function3).apply("Radha"));

      Function<Integer, Integer> fun1 = x -> 2 * x;
      Function<Integer, Integer> fun2 = x -> x * x * x;
     // System.out.println(fun1.andThen(fun2).apply(3));
     // System.out.println(fun2.andThen(fun1).apply(3));

     // System.out.println(fun1.compose(fun2).apply(3));

      Function<String,String> identityFuction=Function.identity();
     // System.out.println(identityFuction.apply("mukesh singh"));

     
   }
}
