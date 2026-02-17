//A factory creates objects instead of creating them directly.

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equals("Circle"))
            return new Circle();
        else if (type.equals("Square"))
            return new Square();
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("Circle");
        s1.draw();

        Shape s2 = factory.getShape("Square");
        s2.draw();
    }
}
