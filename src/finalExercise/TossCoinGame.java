package finalExercise;

import java.util.Scanner;

public class TossCoinGame {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[])  {

        Player player1 = new Player("Mit");
        Player player2 = new Player("Santi");

        String player1Choice = getPlayer1Choice(player1.getName());
        String player2Choice = getPlayer2Choice(player2.getName(), player1Choice);
        System.out.println(player2Choice);

        Coin coin = new Coin();

        coin.flip();
        String side = coin.getSide();
        System.out.println("The coin landed on " + side + "!");
        System.out.println(getWinner(player1.getName(), player2.getName(), player1Choice, side));
    }

    public static String getPlayer1Choice(String player1Name) {
        String player1Choice = "";

        while (!player1Choice.equals("Head") && !player1Choice.equals("Tail")) {
            System.out.println("Player " + player1Name + ", please choose a side:");
            player1Choice = scanner.next();
        }

        return player1Choice;
    }

    public static String getPlayer2Choice(String player2Name, String player1Choice) {
        String player2Choice = "Head";
        if (player1Choice.equals("Head")) {
            player2Choice = "Tail";
        }
        return "Player " + player2Name + "'s choice is: " + player2Choice;
    }

    public static String getWinner(String player1name, String player2Name, String player1Choice, String side) {
        String winner;
        if (side.equals(player1Choice)) {
            winner = "The winner is " + player1name;
        } else {
            winner = "The winner is " + player2Name;
        }
        return winner;
    }
}
