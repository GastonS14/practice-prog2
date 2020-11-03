package tpe;

<<<<<<< HEAD
import tpe.gameStrategy.GameStrategy;
=======
import TPE.estrategias_de_juego.GameStrategy;
>>>>>>> 50bb3efe4bbf2c26c3aba629b9c51f54ede37459

import java.util.ArrayList;

public class Player {

    private String name;
    private Deck deck;
    private GameStrategy gameStrategy;

    public Player(String name, GameStrategy gameStrategy){
        this.name = name;
        this.gameStrategy = gameStrategy;
        this.deck = new Deck();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public GameStrategy getGameStrategy() {
        return gameStrategy;
    }

    public void setGameStrategy(GameStrategy gameStrategy) {
        this.gameStrategy = gameStrategy;
    }

    public void addCard(Card card){
        deck.addCard(card);
    }
=======
    // Gas- dealCard se traduce a repartir carta, por que un jugador deberia repartir?
    public void dealCard(Card card){
        cards.add(card);
    }

	// Gas- cambiar por .isEmpty()
	public boolean hasCards() {
		return cards.size() > 0;
	}
	
	@Override
	public boolean equals(Object o) {
		// Un jugador es igual a otro si tiene el mismo nombre
		try {
			Player player = (Player) o;
			return this.getName().equals(player.getName());
		} catch (Exception e) {
			return false;
		}
	}
>>>>>>> 50bb3efe4bbf2c26c3aba629b9c51f54ede37459

    public Card getCard(){
        return deck.getCard();
    }

    public int getCountCards(){
        return this.deck.getSize();
    }

    public String getFightAttribute(Card card){
        return gameStrategy.getAttribute(card);
    }

    public boolean hasCards(){
        return deck.getSize() > 0;
    }

<<<<<<< HEAD
=======
	// Gas- si estoy en player y hago .getAttribute me imagino que es un atributo del jugadro, no de la carta
	// cambiar por getCardAttibute
	public String getAttribute(Card card) {
		return gameStrategy.getAttribute(card);
	}
>>>>>>> 50bb3efe4bbf2c26c3aba629b9c51f54ede37459

}
