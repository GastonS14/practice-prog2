package TPE;

public class Game {

	private int maxRounds;
    private Player turnPlayer;
    private Player nextPlayer;
    private Deck deck;
    private int roundsPlayed = 0;
    
    public Game(Player playerA, Player playerB, Deck deckGame, int rounds){
        this.turnPlayer = playerA;
        this.nextPlayer = playerB;
        this.deck = deckGame;
        this.turnPlayer = playerA;
        this.maxRounds = rounds;
    }

    public int getMaxRounds() {
    	return maxRounds;
    }
    
    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deckGame) {
        this.deck = deckGame;
    }

    public void play() {
        deck.dealCards(turnPlayer, nextPlayer);
        if ( ! isGameFinished() ) {
        	Card turnPlayerCard = turnPlayer.getCard();
        	Card nextPlayerCard = nextPlayer.getCard();
        	String attribute = turnPlayer.getAttribute(turnPlayerCard);
        	Player roundWinner = getRoundWinner(turnPlayerCard, nextPlayerCard, attribute);
        	roundsPlayed++;
        	if ( roundWinner != null) { // Si hubo ganador de la ronda...
        		roundWinner.dealCard(nextPlayerCard);
        		roundWinner.dealCard(turnPlayerCard);
            	printRound(attribute, turnPlayerCard, nextPlayerCard, roundWinner);
            	// Checkeo si alg�n jugador se qued� sin cartas
            	if ( isGameFinished() ) {
            		printWinner();
            	}
            	// Si el que gan� la ronda es diferente al que tiene al turno...
            	if ( ! roundWinner.equals(turnPlayer))
            		changeTurn(roundWinner);
        	} else {
        		turnPlayer.dealCard(turnPlayerCard);
        		nextPlayer.dealCard(nextPlayerCard);
            	printRound(attribute, turnPlayerCard, nextPlayerCard, roundWinner);
            	if ( isGameFinished() ) {
            		printWinner();
            	}
        	}
        }
    }

    // El juego termina cuando se alcanzan las rondas m�ximas o alg�n jugador no tiene m�s cartas
	public boolean isGameFinished() {
		return roundsPlayed == maxRounds || ! turnPlayer.hasCards() || ! nextPlayer.hasCards();
	}

	private void changeTurn(Player roundWinner) {
		Player aux = turnPlayer;
		turnPlayer = roundWinner;
		nextPlayer = aux;
	}

	private void printWinner() {
		if (turnPlayer.getNumberOfCards() > nextPlayer.getNumberOfCards())
			System.out.println("�Felicidades " + turnPlayer.getName() + ", has ganado!");
		else {
			if (turnPlayer.getNumberOfCards() < nextPlayer.getNumberOfCards())
				System.out.println("�Felicidades  " + nextPlayer.getName() + ", has ganado!");
			else
				System.out.println("�EMPATE!");
		}
	}

	private void printRound(String attribute, Card turnPlayerCard,
	Card nextPlayerCard, Player roundWinner) {
		String winner;
		if (roundWinner == null)
			winner = "Nadie. Hubo empate";
		else
			winner = roundWinner.getName();
		String msg = "------- Ronda " + roundsPlayed + " -------\n" +
			"\nEl jugador " + turnPlayer.getName() +
			" selecciona competir por el atributo " + attribute + 
			"\nLa carta de " + turnPlayer.getName() + " es " + turnPlayerCard.getHeroName() +
			" con " + attribute + " " + turnPlayerCard.getValueAttribute(attribute) +
			"\nLa carta de " + nextPlayer.getName() + " es " + nextPlayerCard.getHeroName() +
			" con " + attribute + " " + nextPlayerCard.getValueAttribute(attribute) +
			"\nGana la ronda: " + winner + "\n" +
			turnPlayer.getName() + " posee ahora " + turnPlayer.getNumberOfCards() +
			" cartas y " + nextPlayer.getName() + " posee ahora " +
			nextPlayer.getNumberOfCards() + " cartas\n";
		System.out.println(msg);
	}

	private Player getRoundWinner(Card turnPlayerCard, Card nextPlayerCard, String attribute) {
		if (turnPlayerCard.getValueAttribute(attribute) >
		nextPlayerCard.getValueAttribute(attribute))
			return turnPlayer;
		else {
			if (turnPlayerCard.getValueAttribute(attribute) <
					nextPlayerCard.getValueAttribute(attribute))
				return nextPlayer;
			else 
				return null;
		}
	}

}
