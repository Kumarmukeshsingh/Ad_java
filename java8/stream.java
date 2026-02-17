import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream {
   public static void main(String[] args) {
      List<Integer> list = Arrays.asList(1, 46, 54, 64, 3, 57, 3, 3, 7, 3, 6, 3, 5, 3);
      // list.parallelStream();// for big collections
      // Stream<Integer> filterList = list.stream();
      // long data = filterList.filter(x -> x % 2 == 0).max((a,b)->a-b)
      // .count()
      // System.out.println(data);

      // list.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));
      // List<Integer> flist = list.stream().filter(x -> x % 2 == 0).map(x -> x /
      // 2).distinct().sorted((a, b) -> (b - a))
      // .limit(4).skip(1).collect(Collectors.toList());
      // System.out.println(flist);

      // itrate the value of stream
      // List<Integer> collect = Stream.iterate(0, x -> x + 1)
      // .limit(100)
      // .filter(x -> x % 2 == 0)
      // .peek(x -> System.out.println(x))
      // .skip(1)
      // .collect(Collectors.toList());
      // System.out.println(collect);

   }
}
