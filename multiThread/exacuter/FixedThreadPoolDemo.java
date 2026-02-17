import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
   public static void main(String[] args) {
      long startTime = System.currentTimeMillis();
      ExecutorService executorService = Executors.newFixedThreadPool(3);
      for(int i=0;i<10;i++){
         int finalI = i;
         executorService.submit(()->{
            long result = factN(finalI);
            System.out.println(result);
         });
      }
      executorService.shutdown();
      System.out.println("total time : " + (System.currentTimeMillis()- startTime));
      
   }

   private static long factN(int n) {
      int fact = 1;
      for (int i = 1; i < n; i++) {
         fact = fact * i;
      }
      return fact;
   }
}
