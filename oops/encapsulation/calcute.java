class area {
   public int length;
   private int bregth;
// constructor
   public area(int length, int bregth) {
      this.length = length;
      this.bregth = bregth;
   }

   // mathod to calculate
   public void getArea() {
      int area = length * bregth;
      System.out.println(area);
   }
}

public class calcute {
   public static void main(String[] args) {
      area a = new area(2, 16);
      a.getArea();
   }
}