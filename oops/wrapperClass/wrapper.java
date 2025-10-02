// a wrapper class in java : whose objects encapslute or " wrap " primitive data
// type ,allowing them to be treated as object.
// java primitive data type like ( int ,char,float, boolean,
// byte,short,long,duble etc) are not object themselves.however there are
// we can wrap a primitive value into a wrapper class object
// wrapper class used to convert into primitive data types into object .

// java collection framework (arraylist , hasMap , hasSet , etc) can only store
// objects, not primitive data type directly.wrapper class
// enable primitive value to be stored in these collection. ex
// ArrayList<Integet> not ArrayList <int>
public class wrapper {
   public static void main(String[] args) {

      int a = 5;
      double b = 55.6;

      // convert into wrapper object
      Integer obj = Integer.valueOf(a);
      Double obj2 = Double.valueOf(b);

      if (obj instanceof Integer) {
         System.out.println("object of enteger ");
      }
      if (obj2 instanceof Double) {
         System.out.println(" object of double");
      }

      // convert into primitive type
      int e = obj.intValue();
      double f = obj2.doubleValue();

   }
}