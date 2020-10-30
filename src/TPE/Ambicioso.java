package TPE;

public class Ambicioso extends GameStrategy {

	// El jugador elige el atributo que posea el mayor valor de su carta del turno.
	@Override
	public String getAttribute(Card card) {
		return card.getMaxAttribute();
	}

}
