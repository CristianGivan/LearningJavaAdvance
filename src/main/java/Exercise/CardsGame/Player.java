package Exercise.CardsGame;

import java.util.List;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public List<String> dealHand(Deck deck, int numberOfCard){
        List<String>deckCards=deck.getDeckCards();
        List<String> playersCard =deckCards.subList(deckCards.size()-numberOfCard
                ,deckCards.size());
        return playersCard;
    }
}
