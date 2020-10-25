package TPE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player {

    private String name;
    private Boolean turn;
    private Deck deck;

    public Player(String name){
        this.name = name;
        this.turn = false;
        this.deck = new Deck("Deck-"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTurn(Boolean turn) {
        this.turn = turn;
    }

    public void addCard(Card card){
        deck.addCard(card);
    }

    public void addCards(ArrayList<Card> cards){
        deck.addCards(cards);
    }

    public boolean isNotEmpty(){
        return deck.getSize() > 0;
    }

    public Card getCard(){
        return deck.getCard();
    }

    public int getCountCards(){
        return this.deck.getSize();
    }

    public String getFightAttribute(Card card){
        List<String> attributeList = card.getAttributesName();
        Collections.shuffle(attributeList); // Random Order
        return attributeList.get(0); // Return first element
    }
}
