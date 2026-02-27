import java.util.ArrayList;

public class StudentManager {

    //  dynamic list that stores ALL students
    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {

        // Check if student with same ID already exists
        if (findStudentById(student.getId()) != null) {
            System.out.println("Student with this ID already exists!");
            return;
        }

        students.add(student);
        System.out.println("Student added successfully.");
    }

    
    public Student findStudentById(int id) {

        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }

        return null; // Not found
    }

    // Remove student
    public void removeStudent(int id) {

        Student s = findStudentById(id);

        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        students.remove(s);
        System.out.println("Student removed successfully.");
    }

    // Display all students
    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            s.ShowStudentinfo();
            System.out.println("Average: " + s.getAverage());
            System.out.println("---------------------");
        }
    }
}