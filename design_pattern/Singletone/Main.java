// Only ONE object of a class can exist.
class Principal {

    // Step 1: create a private static object
    private static Principal instance;

    // Step 2: make constructor private
    private Principal() {
        System.out.println("Principal created");
    }

    // Step 3: provide a public method to get the object
    public static Principal getInstance() {
        if (instance == null) {
            instance = new Principal();
        }
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {
        Principal p1 = Principal.getInstance();
        Principal p2 = Principal.getInstance();

        System.out.println(p1 == p2); // true (same object)
    }
}
