package tpe;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;
    private Card cardArchetype;


    public Deck(){
        cards = new ArrayList<>();
    }

    public Deck(String jsonFile){
        cards = new ArrayList<>();
        MapObject.convertToObject(jsonFile);
    }

<<<<<<< HEAD
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
=======
    // Gas- Esto está mal, en el main vos le pasas una estructura y llegado el caso de sea valido, ahora tu estructura interna apunta a la estructura que te pasaron
	// la cual todavia sigue siendo manipulable desde el main, chau encapsulamiento, esto es un 2 foerteeee perro jajajaj
    public Deck(ArrayList<Card> cards) {
    	if (isValid(cards))
    		this.cards = cards;
    }

    /* Se considera valido un conjunto de cartas si este no es vacio y
       cada carta tiene la misma cantidad y los mismos atributos que cardArchetype */
    private boolean isValid(ArrayList<Card> _cards) {
    	if (_cards.size() > 0) {
    		// Gas- este es el error que corregimos con luis, la primer carta no tiene que ser el modelo, porque si la borran ese atributo te queda en null
			// tenes que hacer una copia de lo que necesitas para validar, yo lo hacia con la carta entera pero solo con los atributos basta
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

	// Gas- el método addCard como su nombre lo indica debe agregar una carta, no validarlo tambien-> sugiero cambiar el nombre del metodo o separar los metodos de validar y agregar
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
>>>>>>> 50bb3efe4bbf2c26c3aba629b9c51f54ede37459
    }

	// Gas- lo mismo aca, el método hace mas de lo que su nombre dice-> sugiero cambiar el nombre del metodo
	// tal vez removeAndGetCard
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

<<<<<<< HEAD
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
=======
    public boolean isEmpty() {
		// Gas- cambiar por cards.size().isEmpty()
		// el 1 es constante en codigo, nunca estan bien las constantes en codigo y tener que declararla como una variable para esto mejor usar el isEmpty()
    	return cards.size() < 1;
    }

    public void dealCards(Player playerA, Player playerB){
    	Collections.shuffle(cards); // Mezclo las cartas
		// Gas- mismo caso, 0 es constante en codigo, cambiar por !cards.size().isEmpty()
    	while (cards.size() > 0) {
    		Card card = cards.get(0);
    		playerA.dealCard(card);
    		cards.remove(card);
			// Gas- mismo caso, 0 es constante en codigo, cambiar por !cards.size().isEmpty()
    		if (cards.size() > 0) {
    			card = cards.get(0);
    			playerB.dealCard(card);
    			cards.remove(card);
    		}
    	}
    }

	// Gas- por que obtener una carta random? Siempre se pide la carta de mas arriba(puede ser la primera o la ultima, por conveniencia usaría la primera)
	// ya que el get en arrayList busca el primer elemento -> get(0)
	// pensalo como un juego de cartas de la vida real, vos no agarras cualquier carta, siempre la de arriba
	public Card getRandomCard() {
		int randomIndex = (int) (Math.random() * cards.size());
		return cards.get(randomIndex);
	}
	
	public int size() {
		return cards.size();
	}
>>>>>>> 50bb3efe4bbf2c26c3aba629b9c51f54ede37459

}
