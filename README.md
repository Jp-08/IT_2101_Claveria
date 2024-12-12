# IT_2101_Claveria

# I. Project Overview
This project implements a Student Grading System in Java. The system manages and displays information about students and teachers, calculates the average grades of students, and determines their pass/fail status based on predefined criteria. It leverages Object-Oriented Programming (OOP) principles for better modularity, reusability, and maintainability.

- The key functionalities of the program include:

- Collecting and displaying information about students and teachers.

- Calculating a student's average grade.

- Determining if a student has passed or failed based on their grades.

- Demonstrating the use of abstract classes, encapsulation, inheritance, and polymorphism.

# Application of OOP Principles

1. Abstraction

- The program uses an abstract class Person to define common properties and methods for both students and teachers. This ensures only relevant details are exposed and promotes the creation of specialized subclasses.

*Example: The abstract method displayInfo() in the Person class is implemented differently in the Student and Teacher subclasses.*

2. Encapsulation

Encapsulation is achieved by:

- Declaring class fields as private.

- Providing public getter and setter methods to control access to these fields.

*Example: The Student and Teacher classes encapsulate their fields such as age, grades, and subject, respectively.*

3. Inheritance

- The Student and Teacher classes inherit from the Person class, allowing shared properties and behaviors to be reused, reducing redundancy.

*Example: Both Student and Teacher classes utilize the name property from the Person class.*

4. Polymorphism

- Polymorphism is demonstrated by overriding the displayInfo() method in the Student and Teacher subclasses to provide class-specific implementations.

*Example: The Student class adds grade-specific information, while the Teacher class focuses on subject-specific details.*

# III. Integration of the Chosen SDG

The project integrates Sustainable Development Goal (SDG) 4: Quality Education, which focuses on ensuring inclusive and equitable quality education and promoting lifelong learning opportunities for all.

The system supports SDG 4 by:

- Demonstrating how digital tools can assist in tracking student performance and teacher contributions.

- Providing a simple yet effective structure for implementing automated educational tools.

- Serving as a foundation for further development of more advanced education-related systems.

This project could be expanded to include features such as tracking attendance, generating performance reports, and providing feedback for improvement, all aligned with the goal of enhancing education quality.

# IV. Instructions for Running the Program

1. Requirements:

- Java Development Kit (JDK) installed.

- A Java-compatible IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VS Code).

2. Steps to Compile and Run:

- Save the code in a file named GradingSystem.java.

- Open a terminal or command prompt and navigate to the file's directory.

- Compile the program using the command:

    *- javac GradingSystem.java*

- Run the program using the command:

    *- java GradingSystem*

3. Program Flow:

- The program will prompt for student and teacher information:

- Student details: Name, age, ID, number of grades, and grades.

- Teacher details: Name and subject.

- The program will calculate and display the student's average grade, pass/fail status, and teacher details.

- It will also display a brief system information message.

