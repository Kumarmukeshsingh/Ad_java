import java.util.*;
class priority {
    public static void main(String[] args) {
        Runnable r = () ->{
            System.out.println("Running Thread: " + Thread.currentThread().getName() + ",Priority: " + Thread.currentThread().getPriority());
        };
        Thread t1 =new Thread(r);
        t1.setName("Ram");
        t1.setPriority(Thread.MIN_PRIORITY);

         Thread t2 =new Thread(r);
        t2.setName("Sita");
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}