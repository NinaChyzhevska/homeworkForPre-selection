package module3;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public void drawCards() {
        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).drawCard();
        }
    }
}
