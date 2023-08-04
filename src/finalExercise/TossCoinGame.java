package finalExercise;

public class TossCoinGame {

    public static void main(String args[])  {

        Player player1 = new Player("Mit");
        Player player2 = new Player("Santi");

        Coin coin = new Coin();

        coin.flip();
        System.out.println(coin.getSide());


    }

}
