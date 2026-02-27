import java.util.Scanner;



public class Main {
        public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Show Student");
            System.out.println("4. Show All Students");
            System.out.println("5. Remove Student");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter max number of grades: ");
                    int maxGrades = scanner.nextInt();

                    Student student = new Student(id, name, maxGrades);
                    manager.addStudent(student);
                    break;
            
                case 2:
                    System.out.print("Enter Student ID: ");
                    int gradeId = scanner.nextInt();

                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();

                    Student s = manager.findStudentById(gradeId);

                    if (s != null) {
                        s.addGrade(grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = scanner.nextInt();

                    Student found = manager.findStudentById(searchId);

                    if (found != null) {
                        found.ShowStudentinfo();
                        found.printGrades();
                        System.out.println("Average: " + found.getAverage());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                
                case 4:
                    manager.displayAllStudents();
                    break;    
                
                case 5:
                    System.out.println("Enter Student ID to remove");
                    int removeid = scanner.nextInt();
                    manager.removeStudent(removeid);  
                    break;
                case 6 : 
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                    
            
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
