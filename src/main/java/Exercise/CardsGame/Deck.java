package Exercise.CardsGame;

import java.util.*;

public class Deck {
    private static List<String> SUIT = Arrays.asList("diams", "spades", "hearts", "clubs");
    private static List<String> RANK = Arrays.asList(
            "2", "3", "4" ,"5", "6", "7", "8", "9", "ace","jack","queen","king");
    private List<String> deckCards;
    //private List<String> shuffleDeckCards;
    public Deck(){
        List<String> deckCards=new ArrayList<>();
        for (String rank : this.RANK) {
            for (String suit : this.SUIT) {
                deckCards.add(rank + " of " + suit);
            }
        }
        this.deckCards=deckCards;
    }
/*
    public List<String> GenerateDeck() {
        for (String rank : this.RANK) {
            for (String suit : this.SUIT) {
                this.deckCards.add(rank + " of " + suit);
            }
        }
        return deckCards;
    }*/

    public void shuffleDeck() {
      Collections.shuffle(this.deckCards);
    }

    public List<String> getDeckCards() {
        return deckCards;
    }

    public void setDeckCards(List<String> deckCards) {
        this.deckCards = deckCards;
    }
}
