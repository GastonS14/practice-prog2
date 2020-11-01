package TPE.pocimas;

import TPE.Card;

public class Reductora extends Potion {

	private double porcentaje;
	
	public Reductora(String name, double porcentaje) {
		this.porcentaje = porcentaje;
		super.setName(name);
	}
	
	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public int getValor(Card card, String attribute) {
		int value = card.getValueAttribute(attribute);
		return (int) (value - value * porcentaje); 
	}

	@Override
	public boolean hasAttribute(String key) {
		return true;
	}

}
