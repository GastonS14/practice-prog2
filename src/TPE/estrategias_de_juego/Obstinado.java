package TPE.estrategias_de_juego;

import TPE.Card;

public class Obstinado extends GameStrategy {

	// Elige siempre el mismo atributo para competir, ronda tras ronda.
	
	private String attribute;
	
	public Obstinado(String attribute) {
		if (attribute != null)
			this.attribute = attribute.toLowerCase();
		else
			this.attribute = null;
	}
	
	public String getAttribute(Card card) {
		// Si el atributo que eligio no es valido, devuelve un atributo al azar
		if (card.hasAttribute(attribute) && attribute != null)
			return card.getKeyAttribute(attribute);
		else
			return card.getRandomAttribute();
	}

}
