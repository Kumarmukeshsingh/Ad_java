// I — Interface Segregation Principle (ISP)
// Clients should not be forced to depend on interfaces they do not use.


// Small, focused interfaces
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

 
// Humans do both
class Human implements Workable, Eatable {
    public void work() {
        System.out.println("Human is working.");
    }
    public void eat() {
        System.out.println("Human is eating.");
    }
}

// Robots only implement Workable
class Robot implements Workable {
    public void work() {
        System.out.println("Robot is working.");
    }
}

public class ISPMain {
    public static void main(String[] args) {
        System.out.println("--- Testing Human Actions ---");
        Human human = new Human();
        human.work();
        human.eat();

        System.out.println("\n--- Testing Robot Actions ---");
        Robot robot = new Robot();
        robot.work();
        // robot.eat(); // This is no longer possible, avoiding any runtime errors!
    }
}