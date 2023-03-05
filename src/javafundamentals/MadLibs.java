package javafundamentals;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]) {

        // 1. Get season
        System.out.println("Enter a season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Get number
        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        // 3. Get adjective
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();

        scanner.close();

        // 4. Display result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
