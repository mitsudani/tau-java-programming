package polymorphism;

public class Apple extends Fruit {

    public Apple(int calories) {
        super(calories);
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made");
    }

    public void removeSeeds() {
        System.out.println("Seeds are removed");
    }

}
