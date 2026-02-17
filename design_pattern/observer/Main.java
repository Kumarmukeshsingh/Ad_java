 //When one object changes, all others are notified automatically.
// Automatic updates
//  Loose coupling

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Student implements Observer {
    private String name;

    Student(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class Teacher {
    private List<Observer> students = new ArrayList<>();

    public void addStudent(Observer o) {
        students.add(o);
    }

    public void notifyStudents(String msg) {
        for (Observer o : students) {
            o.update(msg);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.addStudent(new Student("Aman"));
        teacher.addStudent(new Student("Riya"));

        teacher.notifyStudents("Homework assigned");
    }
}
