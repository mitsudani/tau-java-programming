package decisionstructures;

import java.util.Scanner;

public class TestResults {
    public static void main(String args[]) {

        // Get the test score
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        // Determinate the letter score
        char grade;

        // Make decision
        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        // Output
        System.out.println("Your grade is " + grade);
    }
}
