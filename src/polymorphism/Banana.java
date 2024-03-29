package polymorphism;

public class Banana extends Fruit {

    public Banana(int calories) {
        super(calories);
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is made");
    }

    public void peel() {
        System.out.println("Peeled");
    }
}
