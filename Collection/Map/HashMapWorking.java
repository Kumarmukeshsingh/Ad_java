import java.util.HashMap;
import java.util.Objects;

public class HashMapWorking {

   // buket: store the hash value in a key valu pair
   // hash function : -- it is an algorithm that take an input(or key) ans return a
   // fixed-sise string of bytes,typically a numerical value.the output is known as
   // hash code , hash value or has .
   // the primary purpose of a hash function is to map data of arbitrary size to
   // data fixed size

   // deteministic : same input will be produced the same output.
   // fixed output size: regardless of the input size, the hash code has a
   // consistent size eg: (32-bit,64-bit).
   // efficeint Computations: the hash function should compute the hash quickly.

   // # how data is store in has map

   // step 1: hashing the key
   // --------------------------------
   // key passed through a hash function to genrate a unique hash code (Integer
   // number). this code helps determine where the key-value pair will be stored in
   // the array (called bukcket arrya)

   // default array size 16 in hash map

   // step 2 : calculating the index
   // -----------------------------
   // the hash code is then used to calculate an index in the array (bukcket
   // location) using
   // int index = hashCode % arraySize;

   // the index decides which bukcket will holde this key value pair.

   // step 3 : store in the bucket
   // --------------------
   // the key-value pair is stored int the bucket at the calculated index. each
   // bucket can holde multiple key value pairs.
   // this is called collision handling mechanism

   // how to retrive data in hash map
   // hashing the key:: calculate the index
   // finding the index:: searh in a bucket
   // searching in the bucket:: find the key

   // collision : if put the same data more than one time than collision maybe
   // produced tc O(n);

   // handling the collision : using red black tree ( self balancing binnay search
   // tree)

   // when collison the  data is store  in a linkedlist

   // -----------------------------
   // hashMap Resizing (Rehashing):
   // when the number of elements grows and exceeds a certain load factor (default
   // is 0.75), hashmap automatically Resizes the array to hold more data this
   // process is called rehashing;

   // ----- default size arry is 16 , so when more than 12 elements(16 * 0.75) are
   // inserted.

   // time complixity O(1)

   public static void main(String[] args) {
      HashMap<Person, String> map = new HashMap<>();
      Person p1 = new Person("ram", 10);
      Person p2 = new Person("shysm", 13);
      Person p3 = new Person("ram", 10);

      map.put(p1, "engin");
      map.put(p2, "desiginer");
      map.put(p3, "manager");
      
      System.out.println("size:" + map.size());
      System.out.println("value of p1" + map.get(p1));
      System.out.println("valur of p3" + map.get(p3));
      System.out.println(p1);
   }

}

class Person {
   String name;
   int id;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public Person(String name, int id) {
      this.name = name;
      this.id = id;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }
      if (obj == null) {
         return false;
      }
      if (getClass() != obj.getClass()) {
         return false;
      }

      Person other = (Person) obj;
      return id == other.getId() && Objects.equals(name, other.getName());
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, id);
   }

   @Override
   public String toString() {
      return "id " + id + ",name" + name;
   }

}
