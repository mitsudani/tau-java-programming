package polymorphism;

public class Zoo {

    public static void main(String args[]) {

        Dog shiba = new Dog();
        shiba.fetch();
        shiba.makeSound();
        feed(shiba);

        Animal hana = new Dog();
        hana.makeSound();

        hana = new Cat();
        hana.makeSound();
        ((Cat) hana).scratch();
        feed(hana);

    }

    public static void feed(Animal animal) {

        if (animal instanceof Dog) {
            System.out.println("Here is your dog food");
        }

        else if (animal instanceof Cat) {
            System.out.println("Here is your cat food");
        }

    }
}
