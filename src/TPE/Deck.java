package TPE;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;
    private Card cardArchetype;

    public Deck(){
        this.cards = new ArrayList<>();
    }
    
    public Deck(ArrayList<Card> cards) {
    	if (isValid(cards))
    		this.cards = cards;
    }

    /* Se considera valido un conjunto de cartas si este no es vacio y
       cada carta tiene la misma cantidad y los mismos atributos que cardArchetype */
    private boolean isValid(ArrayList<Card> _cards) {
    	if (_cards.size() > 0) {
    		cardArchetype = _cards.get(0); // La primer carta se toma como modelo
    		for (int i = 0; i < _cards.size(); i++) {
    			Card card = _cards.get(i);
    			if ( ! card.equals(cardArchetype) )
    				return false;
    		}
    		return true;
    	} else
    		return false;
	}

	public void addCard(Card card){
		if (card != null) {
			// La primer carta agregada al mazo se convierte en la cardArchetype
			if (cards.isEmpty()) {
				cards.add(card);
				cardArchetype = card;
			} else {
				// Si ya hay cartas en el mazo, la comparo con la cardArchetype
				if (card.equals(cardArchetype))
					cards.add(card);    		
			}			
		}
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

    public int getSize(){
        return cards.size();
    }

    public void dealCards(Player playerA, Player playerB){
    	Collections.shuffle(cards); // Mezclo las cartas
    	while (cards.size() > 0) {
    		Card card = cards.get(0);
    		playerA.dealCard(card);
    		cards.remove(card);
    		if (cards.size() > 0) {
    			card = cards.get(0);
    			playerB.dealCard(card);
    			cards.remove(card);
    		}
    	}
    }

}
