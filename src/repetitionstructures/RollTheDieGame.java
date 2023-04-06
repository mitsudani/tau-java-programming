package repetitionstructures;

import java.util.Scanner;
import java.util.Random;

public class RollTheDieGame {
    public static void main(String args[]) {

        // Initialize what we know
        int totalSpaces = 20;
        int rollNumber = 5;

        Scanner scanner = new Scanner(System.in);

        int currentSpace = 0;

        for (int i = 0; i < rollNumber; i++) {

            Random random = new Random();
            int die = random.nextInt(6) + 1;

            currentSpace = currentSpace + die;
            int spacesLeft = totalSpaces - currentSpace;

            if (currentSpace == totalSpaces) {
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You are now on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > totalSpaces) {
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You went over the total spaces! You lose!");
                break;
            } else if (i == (rollNumber-1)) {
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You are now on space " + currentSpace + " and you don't have more rolls left! You lose!");
            } else {
                System.out.println("Roll #" + (i+1) + ": You've rolled a " + die + ". You are now on space " + currentSpace + " and have " + spacesLeft + " more to go.");
            }
        }

        scanner.close();
    }
}
