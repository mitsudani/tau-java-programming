package polymorphism;

public class Market {

    public static void main(String args[]) {

        Apple apple = new Apple(52);
        apple.removeSeeds();
        apple.makeJuice();
        color(apple);

        Fruit anotherApple = new Apple(52);
        anotherApple.makeJuice();

        anotherApple = new Banana(89);
        anotherApple.makeJuice();
        ((Banana) anotherApple).peel();
        color(anotherApple);

    }

    public static void color(Fruit fruit) {

        if (fruit instanceof Apple) {
            System.out.println("Red");
        }

        else if (fruit instanceof Banana) {
            System.out.println("Yellow");
        }

    }
}
