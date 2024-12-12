import java.util.Scanner; // Importing Scanner for user input

// Abstract Class (Abstraction)
abstract class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter and Setter Methods (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract Method
    public abstract void displayInfo();
}

// Student Class (Inheritance and Encapsulation)
class Student extends Person {
    private int age;
    private String studentId;
    private double[] grades;

    // Constructor
    public Student(String name, int age, String studentId, double[] grades) {
        super(name);
        this.age = age;
        this.studentId = studentId;
        this.grades = grades;
    }

    // Getters and Setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    // Method to calculate average grade
    public double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    // Method to check if the student passed
    public String getPassStatus() {
        double average = calculateAverage();
        if (average >= 60) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    // Overridden Abstract Method (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("\n==================== Student Information ====================");
        System.out.printf("| %-20s | %-10s | %-10s | %-12s | %-12s |\n", "Student Name", "Age", "ID", "Average Grade", "Status");
        System.out.println("=============================================================");
        System.out.printf("| %-20s | %-10d | %-10s | %-12.2f | %-12s |\n", getName(), age, studentId, calculateAverage(), getPassStatus());
        System.out.println("=============================================================");
    }
}

// Teacher Class (Inheritance and Encapsulation)
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    // Getter and Setter
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Overridden Abstract Method (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("\n==================== Teacher Information ====================");
        System.out.printf("| %-20s | %-10s |\n", "Teacher Name", "Subject");
        System.out.println("=============================================================");
        System.out.printf("| %-20s | %-10s |\n", getName(), subject);
        System.out.println("=============================================================");
    }
}

// Main Class
public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collecting Student Data
        System.out.println("Enter Student Name:");
        String studentName = scanner.nextLine();
        System.out.println("Enter Student Age:");
        int studentAge = getIntInput(scanner);
        System.out.println("Enter Student ID:");
        scanner.nextLine(); // Consume the leftover newline
        String studentId = scanner.nextLine();
        System.out.println("Enter the number of grades:");
        int gradeCount = getIntInput(scanner);

        double[] grades = new double[gradeCount];
        System.out.println("Enter the grades:");
        for (int i = 0; i < gradeCount; i++) {
            grades[i] = scanner.nextDouble();
        }

        Student student = new Student(studentName, studentAge, studentId, grades);

        // Collecting Teacher Data
        System.out.println("\nEnter Teacher Name:");
        scanner.nextLine(); // Consume the leftover newline
        String teacherName = scanner.nextLine();
        System.out.println("Enter Teacher Subject:");
        String teacherSubject = scanner.nextLine();

        Teacher teacher = new Teacher(teacherName, teacherSubject);

        // Displaying Information
        student.displayInfo();
        teacher.displayInfo();

        // Static Method Call
        System.out.println("\nGrading System Info:");
        printSystemInfo();

        scanner.close(); // Close the scanner
    }

    // Helper method to handle integer inputs and avoid InputMismatchException
    public static int getIntInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Consume the invalid input
        }
        return scanner.nextInt();
    }

    // Static Method to Print System Information
    public static void printSystemInfo() {
        System.out.println("This is a simple student grading system built using Java.");
    }
}
