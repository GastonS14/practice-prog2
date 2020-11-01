package TPE;

import TPE.pocimas.Potion;

import java.util.ArrayList;

public class Game {

	private int maxRounds;
    private Player turnPlayer;
    private Player nextPlayer;
    private Deck deck;
    private int roundsPlayed = 0;
    private ArrayList<Potion> potions;
    
    public Game(Player playerA, Player playerB, Deck deckGame, int rounds){
        this.turnPlayer = playerA;// tenes 2 asignaciones a turnPlayer en el constructor
        this.nextPlayer = playerB;
        this.deck = deckGame;
        this.turnPlayer = playerA;
        this.maxRounds = rounds;
        this.potions = new ArrayList<>();
    }

    public void addPocima(Potion pocima) {
    	potions.add(pocima);
    }
    
    public boolean hayPocimas() {
		// Gas- constante en codigo
    	return potions.size() > 0;
    }

    // Gas- Había pensado en que la incorporen a la carta directamente (manual), nice!
	// Lo que no me gusta es que deck.getRandomCard() se vuelve mas ineficiente cuando se asignen las pocimas y pocimas > cartas
	// imaginate que tenes un mazo de 50 cartas y tenés 49 pociones asignadas pero falta 1, segun el metodo busca una carta random
	// y si ya tiene una pocima no la asigna, osea que puede estar loopeando un monton de veces mas de las que debería aunque ya sabes a que cartas queres ponerle la pocion y cual no
	// solo que como no las guardas en una estructura auxiliar en este metodo no podes saberlo
    public void repartirPocimas() {
    	if ( ! deck.isEmpty()) {
    		for (int i = 0; i < potions.size(); i++) {
    			boolean seAsignoPocion = false;
    			Potion potion = potions.get(i);
    			while ( ! seAsignoPocion) {
    				Card card = deck.getRandomCard();
    				if ( ! card.hasPotion()) {
    					card.setPotion(potion);
    					seAsignoPocion = true;
    				}
    			}
    			// Si llego al total de cartas dejo de repartir pocimas
    			if (i == deck.size() - 1)
    				return;
    		}
    	}
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
		// Gas- delegar, cuando hago repartir cartas se tienen que repartir las pocimas con las cartas
    	if ( hayPocimas() )
    		repartirPocimas();
        deck.dealCards(turnPlayer, nextPlayer);
        while ( ! isGameFinished() ) {
        	Card turnPlayerCard = turnPlayer.getCard(); // Tomo carta del jugador que tiene el turno
        	Card nextPlayerCard = nextPlayer.getCard(); // Tomo carta del jugador que no tiene el turno
        	String attribute = turnPlayer.getAttribute(turnPlayerCard); // Atributo por el cual competir�n
        	Player roundWinner = getRoundWinner(turnPlayerCard, nextPlayerCard, attribute); // Ganador de la ronda
        	roundsPlayed++;
        	// Si alguien gano la ronda le doy las dos cartas
        	if ( roundWinner != null) {
				// Gas- Si tengo que leer lo que dice sin entrar a ver lo que hace
					// jugador reparte carta y le paso una carta como parametro, suena bastante raro
					// Lo normal sería mas como juego.repartirCarta(jugador, carta)
        		roundWinner.dealCard(nextPlayerCard);
        		roundWinner.dealCard(turnPlayerCard);
        	} else {
        		// Si no hay ganador, les regreso las cartas a los jugadores
        		turnPlayer.dealCard(turnPlayerCard);
        		nextPlayer.dealCard(nextPlayerCard);
        	}
        	printRound(attribute, turnPlayerCard, nextPlayerCard, roundWinner);
			// Gas- Este if esta de mas, la condicion de corte está arriba en el while osea que sabes que termino cuando salga del while
			// entonces el printWinner podría estar afuera y solo dejar el if de la linea 102
        	if ( isGameFinished() )
        		printWinner();
        	else {
        		// Si el que gan� la ronda es diferente al que tiene al turno...
				// Gas- Si empataron veo que roundWinner devuelve null, y eventualmente se hará null.equals
				// Agregar check para cuando sea null
        		if ( ! roundWinner.equals(turnPlayer))
        			changeTurn(roundWinner);        		
        	}
        }
    }

    // NICEEEEEE!
    // El juego termina cuando se alcanzan las rondas m�ximas o alg�n jugador no tiene m�s cartas
	public boolean isGameFinished() {
		return roundsPlayed == maxRounds || ! turnPlayer.hasCards() || ! nextPlayer.hasCards();
	}

	// Gas- No entiendo para que esté metodo, con un setTurn no era suficiente?
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

	// NICE
	private void printRound(String attribute, Card turnPlayerCard,
	Card nextPlayerCard, Player roundWinner) {
		
		String extraMsgTurnPlayer = "";
		String extraMsgNextPlayer = "";
		String winner = "";
		
		if (turnPlayerCard.hasPotion()) {
			Potion potion = turnPlayerCard.getPotion();
			if (potion.hasAttribute(attribute)) {
				extraMsgTurnPlayer = ", se aplic� p�cima\n" +potion.getName()+
				" valor resultante "+potion.getValor(turnPlayerCard, attribute);
			}
		}
		if (nextPlayerCard.hasPotion()) {
			Potion potion = nextPlayerCard.getPotion();
			if (potion.hasAttribute(attribute)) {
				extraMsgNextPlayer = ", se aplic� p�cima\n" +potion.getName()+
				" valor resultante "+potion.getValor(nextPlayerCard, attribute);
			}
		}
		if (roundWinner == null)
			winner = "Nadie. Hubo empate";
		else
			winner = roundWinner.getName();
		
		String msg =
		"------- Ronda " + roundsPlayed + " -------\n" +
		"\nEl jugador " + turnPlayer.getName() +
		" selecciona competir por el atributo " + attribute + 
		"\nLa carta de " + turnPlayer.getName() + " es " + turnPlayerCard.getHeroName() +
		" con " + attribute + " " + turnPlayerCard.getValueAttribute(attribute) + extraMsgTurnPlayer +
		"\nLa carta de " + nextPlayer.getName() + " es " + nextPlayerCard.getHeroName() + 
		" con " + attribute + " " + nextPlayerCard.getValueAttribute(attribute) + extraMsgNextPlayer +
		"\nGana la ronda: " + winner + "\n" +
		turnPlayer.getName() + " posee ahora " + turnPlayer.getNumberOfCards() +
		" cartas y " + nextPlayer.getName() + " posee ahora " +
		nextPlayer.getNumberOfCards() + " cartas\n";
		
		System.out.println(msg);
	}

	private Player getRoundWinner(Card turnPlayerCard, Card nextPlayerCard, String attribute) {
		int turnCardValue = turnPlayerCard.getValueAttribute(attribute);
		int nextCardValue = nextPlayerCard.getValueAttribute(attribute);

		//-----------------------------------------------------------------------------Mismo código
		if (turnPlayerCard.hasPotion()) {
			Potion potion = turnPlayerCard.getPotion();
			if (potion.hasAttribute(attribute))
				turnCardValue = potion.getValor(turnPlayerCard, attribute);
		}
		if (nextPlayerCard.hasPotion()) {
			Potion potion = nextPlayerCard.getPotion();
			if (potion.hasAttribute(attribute))
				nextCardValue = potion.getValor(nextPlayerCard, attribute);
		}
		//-----------------------------------------------------------------------------
		if (turnCardValue > nextCardValue)
			return turnPlayer;
		else {
			if (turnCardValue < nextCardValue)
				return nextPlayer;
			else 
				return null;
		}
	}

}
