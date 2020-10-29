package TPE;

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

    public void dealCard(Card card){
        cards.add(card);
    }

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

	public String getAttribute(Card card) {
		return gameStrategy.getAttribute(card);
	}

}
