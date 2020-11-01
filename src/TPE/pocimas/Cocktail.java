package TPE.pocimas;

import java.util.ArrayList;

import TPE.Card;

public class Cocktail extends Potion {

	private ArrayList<Potion> potions;
	
	public Cocktail(String name) {
		super.setName(name);
		this.potions = new ArrayList<>();
	}
	
	public void addPotion(Potion potion) {
		potions.add(potion);
	}
	
	@Override
	public int getValor(Card card, String attribute) {
		int value = 0;
		for (int i = 0; i < potions.size(); i++) {
			Potion potion = potions.get(i);
			if (potion.hasAttribute(attribute))
				
				value += potion.getValor(card, attribute);
		}
		return value;
	}

	@Override
	public boolean hasAttribute(String key) {
		for (int i = 0; i < potions.size(); i++) {
			Potion potion = potions.get(i);
			if (potion.hasAttribute(key))
				return true;
		}
		return false;
	}

}
