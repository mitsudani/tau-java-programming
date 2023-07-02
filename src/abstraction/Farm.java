package abstraction;

public class Farm {

    public static void main(String args[]) {

        // Compilation error, abstract class can't be instantiated
        // Animal animal = new Animal();

        Animal duck = new Duck();
        duck.eat();

        Animal pig = new Pig();
        pig.makeSound();

    }
}
