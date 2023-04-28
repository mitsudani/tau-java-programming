package classesandobjects;

public class PhoneBill {

    // Fields
    private int id;
    private double baseCost;
    private int minutesAssigned;
    private int minutesUsed;

    // Default constructor
    public PhoneBill() {
        id = 0;
        baseCost = 99.9;
        minutesAssigned = 600;
        minutesUsed = 600;
    }

    // Only-ID Constructor
    public PhoneBill(int id) {
        this.id = id;
        baseCost = 99.9;
        minutesAssigned = 600;
        minutesUsed = 600;
    }

    // All fields Constructor
    public PhoneBill(int id, double baseCost, int minutesAssigned, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.minutesAssigned = minutesAssigned;
        this.minutesUsed = minutesUsed;
    }

    // Getters
    public int getId() {
        return id;
    }
    public double getBaseCost() {
        return baseCost;
    }
    public int getMinutesAssigned() {return minutesAssigned;}
    public int getMinutesUsed() {return minutesUsed;}

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setMinutesAssigned(int minutesAssigned) {
        this.minutesAssigned = minutesAssigned;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    // Methods
    public int calculateOverageMinutes(int minutesUsed, int minutesAssigned) {
        int overageMinutes = minutesUsed - minutesAssigned;
        if (minutesAssigned > minutesUsed) {
            return 0;
        } else {
            return overageMinutes;
        }
    }

    public double calculateOverage(int overageMinutes) {
        double overageCharge = 0.25;
        return overageCharge * overageMinutes;
    }

    public double calculateTax(double basePlanCost, double overage) {
        double taxPercent = 0.15;
        return (basePlanCost + overage) * taxPercent;
    }

    public double calculateTotal(double basePlanCost, double overage, double tax) {
        return basePlanCost + overage + tax;
    }

    public void printBill(double basePlanCost, double overage, double tax, double total) {
        System.out.println("Phone Bill Statement\nPlan: $" + basePlanCost + "\nOverage: $" + overage + "\nTax: $" + tax +  "\nTotal: $" + total);
    }

}
