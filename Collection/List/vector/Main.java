import java.util.*;
//a vector in java is a part of the java.util package and is one of the legacy class in java that implements the lis inteface
// it was introuduced in jdk 1.0 before collection framwork and is synchronized making the thred-save.
// it increse double form tha previous capacity
// key features: dynamic array , synchronized , legacy class, resizing machnisem.
// constructor of vector:
// vactor()  initial capacty of vector is 10
// vector( int initialCapaity);
// vactor(in initialCapaity,int capactyIncremtnt);
// vactor(collectin<>);
// vector hash a syncronize but performance is low in a singl thred 
// vector do the thered septy
 
public class Main {
   public static void main(String[] args) {
      
      Vector<Integer> vc = new Vector<>();
      vc.add(8);
      vc.add(8);
      vc.add(8);
      vc.add(8);
      System.out.println(vc);
      System.out.println(vc.capacity());
      vc.clear();// clear the vector

      LinkedList<Integer> ll = new LinkedList<>();
      ll.add(9);
      ll.add(9);
      ll.add(9);
      ll.add(9);
      ll.add(9);
      vc.addAll(ll);
      System.out.println(vc);
      vc.add(2, 5);

      Vector<Integer> vci= new Vector<>(ll);
      System.out.println(vci);
    // method
    
   }
}