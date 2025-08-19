import java.util.*;

// Student class (Encapsulation)
class Student {
    private String id;
    private String name;
    private int marks;

    public Student(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

// Student Management class
class StudentManagement {
    private List<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student s) {
        students.add(s);
    }

    // Search by ID
    public Student searchStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    // Display all
    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
        } else {
            for (Student s : students) {
                s.display();
            }
        }
    }
}

// Main class
public class StudentDemo {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();

        // Adding students
        sm.addStudent(new Student("S101", "Arjun", 85));
        sm.addStudent(new Student("S102", "Meena", 90));
        sm.addStudent(new Student("S103", "Vikram", 78));

        System.out.println("---- All Students ----");
        sm.displayAll();

        System.out.println("\n---- Search Student ----");
        Student s = sm.searchStudent("S102");
        if (s != null) {
            s.display();
        } else {
            System.out.println("Student not found!");
        }
    }
}

