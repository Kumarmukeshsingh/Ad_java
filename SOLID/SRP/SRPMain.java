
// SOLID is a set of 5 object-oriented design principles that help developers write:

// clean code
// maintainable code
// scalable applications
// loosely coupled systems




// A class should have only one reason to change.

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class SalaryCalculator {
    void calculateSalary(Employee emp) {
        System.out.println("Calculating salary for " + emp.name);
    }
}

class EmployeeRepository {
    void save(Employee emp) {
        System.out.println("Saving employee " + emp.name);
    }
}

public class SRPMain {
    public static void main(String[] args) {

        Employee emp = new Employee("Mukesh");

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.calculateSalary(emp);

        EmployeeRepository repository = new EmployeeRepository();
        repository.save(emp);
    }
}