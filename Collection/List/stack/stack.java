// stack has a last  in fast out machnisume;
// stack implement using linklist and array list 
// stac is a syncronized 

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class stack {
   public static void main(String[] args) {
      Stack<Integer> stack = new Stack<>(); // down casting
      stack.push(3);// add on top
      stack.push(2);
      Integer rmv = stack.pop();// rmove from the top
      System.out.println(rmv);
      Integer top = stack.peek();// sho top of the element
      System.out.println(top);
      System.out.println(stack.size());
      stack.add(1, 20);
      stack.removeElementAt(0);
      stack.search(3);

      // achive stack using linked list
      LinkedList<Integer> ll = new LinkedList<>();
      ll.addLast(20);
      ll.addLast(20);
      ll.addLast(20);
      ll.getLast(); // peek
      ll.removeLast(); // pop 
      ll.isEmpty();

    // you can use arry as a stack 
    // achive  stack with the help of array list
      ArrayList<Integer> arrayList = new ArrayList<>();
      arrayList.add(11);
      arrayList.add(11);
      arrayList.add(11);
      arrayList.add(11);
      arrayList.get(arrayList.size()-1);// peek of the
      arrayList.remove(arrayList.size()-1);// pop


   }
}
