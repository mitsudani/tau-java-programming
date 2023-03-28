package decisionstructures;

import java.util.Scanner;

public class DollarGame {
    public static void main(String args[]) {

        // Coin values
        double pennyValue = 0.01;
        double nickelValue = 0.05;
        double dimeValue = 0.10;
        double quarterValue = 0.25;
        double totalToWin = 1.0;

        // Ask the user to enter number of coins
        System.out.println("Enter number of pennies:");
        Scanner scanner = new Scanner(System.in);
        int userPennies = scanner.nextInt();

        System.out.println("Enter number of nickels:");
        int userNickels = scanner.nextInt();

        System.out.println("Enter number of dimes:");
        int userDimes = scanner.nextInt();

        System.out.println("Enter number of quarters:");
        int userQuarters = scanner.nextInt();

        scanner.close();

        // Multiply coins values
        double totalPennies = userPennies * pennyValue;
        double totalNickels = userNickels * nickelValue;
        double totalDimes = userDimes * dimeValue;
        double totalQuarters = userQuarters * quarterValue;

        // Get coins total value
        double userTotal = totalPennies + totalNickels + totalDimes + totalQuarters;

        double wentOverValue = userTotal - totalToWin;
        double wentUnderValue = totalToWin - userTotal;

        // Make decision
        if (userTotal > totalToWin) {
            System.out.println("Oh! You have more than one dollar! You went over by " + wentOverValue + ". You lost!");
        } else if (userTotal < totalToWin) {
            System.out.println("Oh! You have less than one dollar! You went under by " + wentUnderValue + ". You lost!");
        } else {
            System.out.println("Congrats! You have exactly one dollar! You win!");
        }
    }
}
