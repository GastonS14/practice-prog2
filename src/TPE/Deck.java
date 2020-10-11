package TPE;

import java.util.ArrayList;

public class Deck {

    private String deckName;
    private ArrayList<Card> cards;
    private Card cardArchetype;

    public Deck(String deckName){
        this.deckName = deckName;
        cards = new ArrayList<>();
    }

    /**
     * Create random deck
     * @param modelCard generate a validDeck with a modelCard
     * @param deckSize generate a deck with this size
     */
    public Deck(String deckName, Card modelCard, int deckSize){
        this(deckName);
        for(int i=0; i<deckSize; i++)
            this.addCard(new Card(modelCard));
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public void addCard(Card c){
        cards.add(c);
    }

    public void addCards(ArrayList<Card> cards){
        this.cards.addAll(cards);
    }

    public void removeCard(Card c){
        cards.remove(c);
    }

    /**
     * Remove the card from the deck and returns it
     * @return the last card of the deck
     */
    public Card getCard(){
        if(!cards.isEmpty()){
            Card aux = cards.get(0);
            cards.remove(0);
            return aux;
        } else
            return null;
    }

    public Card getCardArchetype() {
        return cardArchetype;
    }

    public void setCardArchetype(Card cardArchetype) {
        this.cardArchetype = cardArchetype;
    }

    /**
     * Add card only if valid
     * @param c Card to be validated
     */
    public void addValidCard(Card c){
        if(cards.isEmpty()){
            this.addCard(c);
            cardArchetype = c;
        }else if(this.getCardArchetype().validateCard(c))
            this.addCard(c);
    }

    /**
     * emptyDeck always is valid
     * @return Boolean Valid deck for a card
     */
    public Boolean validateDeck(){
        if(cards.size() <= 1)
            return true;
        Card modelCard = cards.get(0);
        for (int i = 1; i< cards.size(); i++)
            if (!cards.get(i).containsAllAttributes(modelCard))
                return false;
        return true;
    }

    public int getSize(){
        return this.cards.size();
    }

    public void dealCards(Player playerA, Player playerB){
        for(int i = cards.size()-1; i>=0; i--){
            playerA.addCard(cards.get(i));
            cards.remove(i);
            i--;
            if(i > 0){
                playerB.addCard(cards.get(i));
                cards.remove(i);
            }
        }
    }

}
