// it is the process of hiding the data implemention details and only showing the essentioal details or features to the user;
// -> abstract method emplement with the  help of subclass / child class 
// it does not create the object ;
// it is decleare with an abstract keyword;

abstract class car {
   // abstract method;
   public abstract void drive();

   public void playMusic() {
      System.out.println(" music playing ");
   }
}

abstract class Tata extends car {
   public abstract void flay();

   public void drive() {
      System.out.println(" the car drive on the road ");
   }

}

class newTata extends Tata {

   public void flay() {

      System.out.println(" car fly in the skay ");
   }
}

public class abatract_method {
   public static void main(String[] args) {
      // car obj2 = new car(); can't create object because car is a abstract classs 
      Tata obj = new newTata();
      obj.playMusic();
      obj.drive();
      obj.flay();

   }
}
