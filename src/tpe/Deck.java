package tpe;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;
    private Card cardArchetype;

    public Deck(){
        cards = new ArrayList<>();
    }

    public void addCard(Card c){
        cards.add(c);
    }

    public void addValidCard(Card c){
        if(cards.isEmpty()){
            this.addCard(c);
            cardArchetype = c.getCopy();
        }else if(this.getCardArchetype().validateCard(c))
            this.addCard(c);
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

    private Card getCardArchetype() {
        return cardArchetype;
    }

    /**
     * emptyDeck always is valid
     * @return Boolean Valid deck for a card
     */
    public Boolean isValid(){
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
            if(i >= 0){
                playerB.addCard(cards.get(i));
                cards.remove(i);
            }
        }
    }

}
