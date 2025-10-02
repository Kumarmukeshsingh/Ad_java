import thread.mythred;

class preventing_Thread {

 }

 public static sleep(long milis);
=> it makes  the  current executing thread to sleep for  some specified time.
=> once the time expires , it goes to the runnable state than the thread scheduler decides when it will go to running state.
 => this method guarantees a minimun delay  and guarantee to stope the thread.
public static void yield();
=> it cause current running thread to pause and allows other threads of same priority to execute.
=> it's send to the thread sechedular but schedular is free to ignore this hint.
=> it does not guarantees that thread will stop executing.
=> a yield() won't ever cause a thread to go to the waiting/blocking state.
=> does not go to waiting / blocking state it directly go to running to runnable state.
public state void join()
== > this method wait till  another   thread to be completed. and than that thread will be running/
 
 // ------------------------------------------//
 thread inforamation and status

 public final Synchronized void setName(String name);
 it is use for update the thread name

 public final void setPriority(int new priority);
  thread.min_priority = 1;
  thread.normal_priority = 5;
  thread.max_priority = 10;
=> it pieak the highest priority.

 Synchronization: 
 ==> it resolve the thread race problem 
 => two or more thread want to modifying the same value while other thread reading the value. it can produced unexpected result.
  => when can make a method Synchronized by adding synchronized keyword.
  => when  a thread invoked synchronized method, it automatically acquires the lock for that method and release it when the method completed.
  => static method is synchronized
  public static synchronized int getcount(){
    return count;
  }
// class level syncronized 
  public static int getcount(){
    synchronized(myclass.class){
      count++;
    }
  }

  //-------------------------------------------------
  Thread communication interaction
  there have a three method  wait(); notify(),notifyAll(), all these method is called only within synchronized context.
  wait() => go to the sleep until some other thread calls notify or notifyAll
  notify() => wakes up a thread that called wait() method on the same Object.
  notifyAll() => wakes up all the thread that called wait() method on the same Object.

  -----------------------------
  deadlock:---

