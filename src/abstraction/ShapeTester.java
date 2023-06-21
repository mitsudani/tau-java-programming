package abstraction;

public class ShapeTester {

    public static void main(String args[]) {

        // Compilation error, abstract class can't be instantiated
        //Shape shape = new Shape();

        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
