// D — Dependency Inversion Principle (DIP)
// High-level modules should not depend on low-level modules.Both should depend on abstractions.



// The Abstraction layer
interface Database {
    void connect();
}

// Low-Level Module 1
class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL Database.");
    }
}

// Low-Level Module 2
class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to PostgreSQL Database.");
    }
}




class UserService {
    private final Database database; // Depending on abstraction

    // The database dependency is inverted and injected here
    public UserService(Database database) {
        this.database = database;
    }

    public void saveUser() {
        database.connect();
        System.out.println("User data saved successfully.");
    }
}



public class DIPMain {
    public static void main(String[] args) {
        // 1. Using MySQL
        Database mysql = new MySQLDatabase();
        UserService userServiceWithMySQL = new UserService(mysql);
        
        System.out.println("--- System running with MySQL ---");
        userServiceWithMySQL.saveUser();

        System.out.println(); // Line break

        // 2. Effortlessly switching to PostgreSQL
        Database postgres = new PostgreSQLDatabase();
        UserService userServiceWithPostgres = new UserService(postgres);
        
        System.out.println("--- System running with PostgreSQL ---");
        userServiceWithPostgres.saveUser();
    }
}