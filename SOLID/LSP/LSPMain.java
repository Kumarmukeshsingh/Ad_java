// L — Liskov Substitution Principle (LSP)
// Subclasses should be replaceable with their parent classes without breaking behavior.

// Shared Abstraction
interface Shape {
    int getArea();
}

// Concrete Class 1
class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() { return width * height; }
}

// Concrete Class 2
class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() { return side * side; }
}


public class LSPMain {
    // This client method relies completely on the Shape abstraction
    public static void printArea(Shape shape) {
        System.out.println("Calculated Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(5);

        System.out.println("--- Executing Rectangle ---");
        printArea(rectangle); // Outputs: 50

        System.out.println("\n--- Executing Square ---");
        printArea(square);    // Outputs: 25
    }
}