abstract class shap {
   String color;

   abstract double area();

   public abstract String toString();

   // abstract constructor
   public shap(String color) {
      System.out.println("shap constructor called");
      this.color = color;
   }

   // this is a concrete method
   public String getColor() {
      return color;
   }
}

class Circle extends shap {
   double radius;

   // constructor
   public Circle(String color, double radius) {
      // calling shap constructor
      super(color);
      System.out.println(" circle constructor called");
      this.radius = radius;
   }

   @Override
   double area() {
      return Math.PI * Math.pow(radius, radius);

   }

   @Override
   public String toString() {
      return " circle color is " + super.getColor() + " and area is : " + area();
   }
}

class Rectangle extends shap {
   double length;
   double width;

   public Rectangle(String color, double length, double width) {
      super(color);
      System.out.println(" Rectangle constructor called");
      this.length = length;
      this.width = width;
   }

   @Override
   double area() {
      return length * width;
   }

   @Override
   public String toString() {
      return "Rectangle color is :" + super.getColor() + " area is : " + area();
   }
}

public class Test {
   public static void main(String[] args) {
      shap s1 = new Circle("red", 2.2);
      shap s2 = new Rectangle("yellow", 2, 4);
      System.out.println(s1.toString());
      System.out.println(s2.toString());
   }

}
