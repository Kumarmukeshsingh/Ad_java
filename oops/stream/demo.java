import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class demo {
   public static void main(String[] args) {
      List<Integer> nums = Arrays.asList(2, 4, 5, 6, 3, 5, 6);
      // Stream<Integer> data = nums.stream();
      // // long count = data.count();
      // // System.out.println(count);
      // //  Stream<Integer>mapData= data.map(n->n*3);
      // Stream<Integer> sortData=  data.sorted();
      // sortData.forEach((n) -> {
      //    System.out.println(n);


      // you can do that 
      nums.stream().sorted().forEach(n->System.out.println(n));
   }
}