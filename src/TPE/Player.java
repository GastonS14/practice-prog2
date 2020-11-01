package TPE;

import TPE.estrategias_de_juego.GameStrategy;

import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> cards;
    private GameStrategy gameStrategy;

    public Player(String name, GameStrategy strategy){
        this.name = name;
        this.gameStrategy = strategy;
        this.cards = new ArrayList<>();
    }

    public GameStrategy getGameStrategy() {
		return gameStrategy;
	}

	public void setGameStrategy(GameStrategy gameStrategy) {
		this.gameStrategy = gameStrategy;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

	public Card getCard() {
		Card card = cards.get(0);
		cards.remove(card);
		return card;
	}
	
	public int getNumberOfCards() {
		return cards.size();
	}

	// Gas- si estoy en player y hago .getAttribute me imagino que es un atributo del jugadro, no de la carta
	// cambiar por getCardAttibute
	public String getAttribute(Card card) {
		return gameStrategy.getAttribute(card);
	}

}
