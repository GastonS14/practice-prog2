package TPE.estrategias_de_juego;

import TPE.Card;

public class Timbero extends GameStrategy {

	// el jugador elige al azar el atributo por el cual se desea competir
	
	@Override
	public String getAttribute(Card card) {
		return card.getRandomAttribute();
	}
	
}
