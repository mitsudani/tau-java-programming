package classesandobjects;

import java.util.Scanner;

public class PhoneBillCalculatorEnhanced {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        PhoneBillCalculatorEnhanced calculator = new PhoneBillCalculatorEnhanced();

        PhoneBill bill = calculator.getBill();

        int overageMinutes = bill.calculateOverageMinutes(bill.getMinutesUsed(), bill.getMinutesAssigned());
        double overage = bill.calculateOverage(overageMinutes);
        double tax = bill.calculateTax(bill.getBaseCost(), overage);
        double total = bill.calculateTotal(bill.getBaseCost(), overage, tax);
        bill.printBill(bill.getBaseCost(), overage, tax, total);

        calculator.scanner.close();
    }

    public PhoneBill getBill() {

        System.out.println("Enter id of the bill:");
        int id = scanner.nextInt();

        System.out.println("Enter base cost of the plan:");
        double baseCost = scanner.nextDouble();

        System.out.println("Enter assigned minutes:");
        int minutesAssigned = scanner.nextInt();

        System.out.println("Enter used minutes:");
        int minutesUsed = scanner.nextInt();

        return new PhoneBill(id, baseCost, minutesAssigned, minutesUsed);
    }
}
