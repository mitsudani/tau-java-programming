package arrays;

import java.util.Scanner;

public class DayOfTheWeek {

    private static String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static int dayNumber;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("Enter the number of the day of the week you want to print:");
        dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println("The day is: " + getDay());
        } else {
            System.out.println("The day number is not between 1 and 7.");
        }
    }

    private static String getDay() {
        return daysOfTheWeek[dayNumber - 1];
    }
}
