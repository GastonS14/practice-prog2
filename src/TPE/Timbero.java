package TPE;

public class Timbero extends GameStrategy {

	@Override
	public String getAttribute(Card card) {
		return card.getRandomValue();
	}
	
}
