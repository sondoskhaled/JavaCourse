package FinalProject;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Player player1 = new Player("Ahmed");
        Player player2 = new Player("Mohamed");
        Coin coin = new Coin();
        Scanner scanner = new Scanner(System.in);
        String guess;
        String side;

        /**
         * ask for guess
         */
        System.out.println(String.format("%s or %s" ,coin.HEADS ,coin.TAILS));
        guess = scanner.next();
        while (!guess.equalsIgnoreCase(coin.HEADS)
                 && !guess.equalsIgnoreCase(coin.TAILS)){
            System.out.println("wrong choice please try again");
            guess = scanner.next();
        }
        /**
         * assign guess to player one & the oppisit to player tow
         */
        player1.setGuess(guess);
        if(player1.getGuess().equalsIgnoreCase(coin.HEADS)){
            player2.setGuess(coin.TAILS);
        }else {
            player2.setGuess(coin.HEADS);
        }

        /**
         * filp coin
         */
        coin.flip();
        System.out.println("The coin landed on " + coin.getSide());

        /**
         * determine the winner
         */
        if(coin.getSide().equalsIgnoreCase(player1.getGuess())){
            System.out.println(player1.getName()+ " is the winner");
        }
        else {
            System.out.println(player2.getName()+ " is the winner");
        }



    }


}
