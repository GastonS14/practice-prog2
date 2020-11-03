package TPE.estrategias_de_juego;

import TPE.Card;

public class Obstinado extends GameStrategy {

	// Elige siempre el mismo atributo para competir, ronda tras ronda.
	
	private String attribute;
	
	public Obstinado(String attribute) {
		if (attribute != null)
			this.attribute = attribute.toLowerCase();
		// Gas- attribute ya es null por default(al no asignarle nada), no es necesario el else
		else
			this.attribute = null;
	}
	
	public String getAttribute(Card card) {
		// Si el atributo que eligio no es valido, devuelve un atributo al azar
		// Gas- este control tiene que ser interno, esta clase no puede tener un atributo que no exista, vos tenes que darle la lista que si existen
		// Y que elija entre los que hay
		if (card.hasAttribute(attribute) && attribute != null)
			return card.getKeyAttribute(attribute);
		else
			return card.getRandomAttribute();
	}

}
