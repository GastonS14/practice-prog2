package TPE.pocimas;

import TPE.Card;

public class Selectiva extends Potion {

	private String attribute;
	private double porcentaje;
	
	public Selectiva(String name, String attribute, double porcentaje) {
		this.attribute = attribute.toLowerCase();
		this.porcentaje = porcentaje;
		super.setName(name);
	}
	
	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
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
		return (int) (value + value * porcentaje); 
	}

	@Override
	public boolean hasAttribute(String key) {
		return key.equals(attribute);
	}

}
