package javafundamentals;

import java.util.Scanner;

public class GrossPayCalculator {

    // default method in Java
    public static void main(String arg[]) {

        // 1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        // method depends on the type of data we want to receive
        int hours = scanner.nextInt();

        // 2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
        // close scanner to free memory
        scanner.close();

        // 3. Multiply hours and pay rate
        double grossPay = hours * rate;

        // 4. Display result
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
