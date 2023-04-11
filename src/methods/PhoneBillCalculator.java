package methods;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double overageCharge = 0.25;
    static double taxPercent = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        double basePlanCost = getBasePlanCost();
        int overageMinutes = getOverageMinutes();
        scanner.close();

        double overage = calculateOverage(overageMinutes);
        double tax = calculateTax(basePlanCost, overage, taxPercent);
        double total = calculateTotal(basePlanCost, overage, tax);
        getBill(basePlanCost, overage, tax, total);
    }

    public static double getBasePlanCost() {
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }

    public static int getOverageMinutes() {
        System.out.println("Enter overage minutes:");
        return scanner.nextInt();
    }

    public static double calculateOverage(int overageMinutes) {
        return overageCharge * overageMinutes;
    }

    public static double calculateTax(double basePlanCost, double overage, double taxPercent) {
        return (basePlanCost + overage) * taxPercent;
    }

    public static double calculateTotal(double basePlanCost, double overage, double tax) {
        return basePlanCost + overage + tax;
    }

    public static void getBill(double basePlanCost, double overage, double tax, double total) {
        System.out.println("Phone Bill Statement\nPlan: $" + basePlanCost + "\nOverage: $" + overage + "\nTax: $" + tax +  "\nTotal: $" + total);
    }

}
