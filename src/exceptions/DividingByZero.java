package exceptions;

public class DividingByZero {

    public static void main(String args[])  {

        divideByZero();

    }

    public static void divideByZero() {
        try {
            int c = 30/0;
        } catch (ArithmeticException e) {
            System.out.println("Wrong arithmetic or mathematical operation occurred.");
            e.printStackTrace();
        } finally {
            System.out.println("Division is fun.");
        }
    }
}
