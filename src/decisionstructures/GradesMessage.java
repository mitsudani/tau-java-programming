package decisionstructures;

import java.util.Scanner;

public class GradesMessage {
    public static void main(String args[]) {

        // Get the grade letter
        System.out.println("Enter your grade letter:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;

        // switch statement syntax in Java 12 and higher
        switch (grade) {
            case "A" -> message = "Excellent job!";
            case "B" -> message = "Great job!";
            case "C" -> message = "Good job!";
            case "D" -> message = "You need to work a little bit harder.";
            case "F" -> message = "Uh oh!";
            default -> message = "Error. Invalid grade.";
        };

        // Output
        System.out.println(message);

        // switch statement syntax prev Java 12
//        switch (grade) {
//            case "A":
//                message = "Excellent job!";
//                break;
//            case "B":
//                message = "Great job!";
//                break;
//            case "C":
//                message = "Good job!";
//                break;
//            case "D":
//                message = "You need to work a little bit harder.";
//                break;
//            case "F":
//                message = "Uh oh!";
//                break;
//            default:
//                message = "Error. Invalid grade.";
//                break;
//        }
    }
}
