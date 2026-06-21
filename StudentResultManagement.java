
import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int marks1, marks2, marks3;
    double average;
    char grade;

    void calculateResult() {
        average = (marks1 + marks2 + marks3) / 3.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 40)
            grade = 'D';
        else
            grade = 'F';
    }

    void displayResult() {
        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentResultManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter Student Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        s.rollNo = sc.nextInt();

        System.out.print("Enter Marks in Subject 1: ");
        s.marks1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        s.marks2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        s.marks3 = sc.nextInt();

        s.calculateResult();
        s.displayResult();

        sc.close();
    }
}































































































