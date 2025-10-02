public class synchronize2 {
    public synchronized void greet (String msg) {
        // System.out.print("["+msg);
        // try {
        //     Thread.sleep(1000);
        // } catch ( InterruptedException e) {
        //     // TODO: handle exception
        //     throw new RuntimeException(e);
        // }
        // System.out.println("]" );

        // same result 
        synchronized(this){
             System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        } catch ( InterruptedException e) {
            // TODO: handle exception
            throw new RuntimeException(e);
        }
        System.out.println("]" );
        }
    }

    public static void main(String[] args) {
      synchronize2 obj = new synchronize2();
        Thread t1 = new Thread(()-> {
                obj.greet("hello");
        });
        Thread t2 = new Thread(()-> {
                obj.greet("hello");
        });
        
        t1.start();
        t2.start();
        
    }
}

// without synchronized o/p =
// [hello
// [hello
// ]
// ]
// with sync method o/p = 
// [hello]
// [hello]
