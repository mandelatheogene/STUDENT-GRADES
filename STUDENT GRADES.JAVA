import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int numberOfUnits = 8;

        // Input marks for 8 units
        for (int i = 1; i <= numberOfUnits; i++) {
            System.out.print("Enter marks for Unit " + i + ": ");
            int marks = scanner.nextInt();
            // Validate marks to be between 0 and 100
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Marks should be between 0 and 100.");
                return;
            }
            totalMarks += marks;
        }

        // Calculate average marks
        double averageMarks = (double) totalMarks / numberOfUnits;

        // Determine grade based on average marks
        char grade;
        if (averageMarks >= 70) {
            grade = 'A';
        } else if (averageMarks >= 60) {
            grade = 'B';
        } else if (averageMarks >= 50) {
            grade = 'C';
        } else if (averageMarks >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Output average marks and grade
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}