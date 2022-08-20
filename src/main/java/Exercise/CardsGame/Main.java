package Exercise.CardsGame;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.getDeckCards());
        deck.shuffleDeck();
        System.out.println(deck.getDeckCards());
        Player player1 =new Player("ion");
        List<String> playerCards =player1.dealHand(deck,4);
        System.out.println(playerCards);
    }
}
