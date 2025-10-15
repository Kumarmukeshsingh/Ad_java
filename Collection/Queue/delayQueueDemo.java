import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class delayQueueDemo {
   public static void main(String[] args) throws InterruptedException {
      // thread-safe unbounded blocking queue
      // element can only be taken from the queue when their delay has expierd
      // usefull for scheduling task to be executed after a certain dely
      // internally priority queue
      BlockingQueue<DelayedTask> delayqueue = new DelayQueue<>();

      delayqueue.put(new DelayedTask("Task1", 5, TimeUnit.SECONDS));
      delayqueue.put(new DelayedTask("Task2", 3, TimeUnit.SECONDS));
      delayqueue.put(new DelayedTask("Task3", 10, TimeUnit.SECONDS));

      while (!delayqueue.isEmpty()) {
         DelayedTask task = delayqueue.take();
         System.out.println("Executed: " + task.getTaskName() + " at " + System.currentTimeMillis());
      }
   }
}

class DelayedTask implements Delayed {

   private final String taskName;
   private final long startTime;

   public DelayedTask(String taskName, long delay, TimeUnit unit) {
      this.taskName = taskName;
      this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
   }

   @Override
   public int compareTo(Delayed o) {
      if (this.startTime < ((DelayedTask) o).startTime) {
         return -1;
      }
      if (this.startTime < ((DelayedTask) o).startTime) {
         return 1;
      }
      return 0;
   }

   @Override
   public long getDelay(TimeUnit unit) {
      long remaining = startTime - System.currentTimeMillis();
      return unit.convert(remaining, TimeUnit.MILLISECONDS);
   }

   public String getTaskName() {
      return taskName;
   }

}
