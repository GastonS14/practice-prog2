package TPE.pocimas;

import TPE.Card;

public class Fortalecedora extends Potion {

	private double porcentaje;
	
	public Fortalecedora(String name, double porcentaje) {
		this.porcentaje = porcentaje;
		super.setName(name);
	}
	
	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	// Gas- Si no se usa el param para que lo t
	@Override
	public boolean hasAttribute(String key) {
		return true;
	}

	// Gas- Para que necesitas el atributo si ya los tiene la carta y le aplicas la pocion a todos ellos?
	@Override
	public int getValor(Card card, String attribute) {
		int value = card.getValueAttribute(attribute);
		return (int) (value + value * porcentaje); 
	}

}
