import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
   public static void main(String[] args) {
      // thread safe
      // copy on write machanism
      // iterators do not reflect modification
      // we can update running time

      CopyOnWriteArraySet<Integer> copyArrayset = new CopyOnWriteArraySet<>();// modify during the itrate

      ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>(); // it is weekly consistant
      // frequent read and write

      for (Integer num : copyArrayset) {
         if(num == 5){
            concurrentSkipListSet.add(6);
         }

      }
   }
}
