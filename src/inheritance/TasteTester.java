package inheritance;

public class TasteTester {

    public static void main(String args[]) {

        Cake cake = new Cake("vanilla");
        cake.setPrice(100.50);
        System.out.println("Cake flavor is " + cake.getFlavor() + " and its price is " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake("chocolate");
        birthdayCake.setPrice(150.25);
        System.out.println("Birthday cake flavor is " + birthdayCake.getFlavor() + " and its price is " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake("strawberry");
        weddingCake.setPrice(200.75);
        System.out.println("Wedding cake flavor is " + weddingCake.getFlavor() + " and its price is " + weddingCake.getPrice());

    }
}
