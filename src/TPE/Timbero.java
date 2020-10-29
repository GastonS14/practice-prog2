package TPE;

import java.util.Random;

public class Timbero extends GameStrategy {

	@Override
	public String getAttribute(Card card) {
		int cardAttributes = card.numberOfAttributes();
		int random = getRandomNumberInRange(0, cardAttributes-1);
		return card.getAttribute(random);
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
}
