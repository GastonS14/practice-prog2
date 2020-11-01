package TPE.pocimas;

import TPE.Card;

public class Magica extends Potion {

	private int numero;
	
	public Magica(String name, int numero) {
		this.numero = numero;
		super.setName(name);
	}
	
	@Override
	public int getValor(Card card, String attribute) {
		return numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public boolean hasAttribute(String key) {
		return true;
	}

}
