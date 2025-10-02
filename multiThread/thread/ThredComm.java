public class ThredComm {
    public static void main(String[] args) {
        Restaurent restaurent = new Restaurent();
        Thread chefThread = new Thread(()->{
           restaurent.preparedDish("pizza");
        });
        
        Thread waiterThread = new Thread(()-> {
            restaurent.serveDish("pizza");
        });
        
        chefThread.start();
        waiterThread.start();
    }
}

class Restaurent {

    private boolean dishReady = false;
    public synchronized void preparedDish( String dishName){
     for(int i =0;i<10;i++){
        while (dishReady) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
        System.out.println("chef prepared " + dishName + " - Itreation " + (i+1) );
        dishReady= true;
        notify();
     }
    }

    public synchronized void serveDish(String dishName){
for(int i=0;i<10;i++){
    while (!dishReady) {
         try {
            wait();
         } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
         }
    }
     System.out.println("waiter Serve " + dishName + " - Itreation " + (i+1) );
        dishReady= false;
        notify();
}
    }
}