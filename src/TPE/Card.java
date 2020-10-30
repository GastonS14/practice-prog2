package TPE;

import java.util.*;

public class Card {

    private HashMap<String, Integer> attributes;
    private String heroName;

    public Card(String heroName){
        this.attributes = new HashMap<String, Integer>();
        this.heroName = heroName;
    }
    
    public String getHeroName() {
		return heroName;
	}
    
    public int numberOfAttributes() {
    	return attributes.size();
    }

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

    public void addAttribute(String s,Integer b){
        attributes.put(s.toLowerCase(), b);
    }

    public void removeAttribute(String s){
        attributes.remove(s);
    }
    
    @Override
    public boolean equals(Object o) {
    	// Una carta se considera igual a la otra si tienen los mismos atributos
    	try {
    		Card card = (Card) o;
    		if (this.numberOfAttributes() != card.numberOfAttributes())
    			return false;
    		else {
    			/* Recorro los atributos. Si alguno de ellos no está
    			   en la carta que se está comparando, retorno false. */
    			for (Map.Entry<String, Integer> entry : attributes.entrySet()) {
    				if ( ! card.hasAttribute(entry.getKey()) )
    					return false;
    			}
    			return true;
    		}
    	} catch (Exception e) {
    		return false;    		
    	}
    }

    public boolean hasAttribute(String key) {
		return attributes.containsKey(key);
	}
    
	public Integer getValueAttribute(String key){
		if (this.hasAttribute(key))
			return attributes.get(key);
		else
			return null;
    }
	
	public String getKeyAttribute(String key) {
		if (this.hasAttribute(key))
			return key;
		else
			return null;
	}

	// elige el atributo que posea el mayor valor
	public String getMaxAttribute() {
		// Selecciono el primer entry
		Map.Entry<String, Integer> maxEntry = attributes.entrySet().iterator().next();
		if (maxEntry != null) {
			for (Map.Entry<String, Integer> entry : attributes.entrySet()) {
				if (entry.getValue() > maxEntry.getValue())
					maxEntry = entry;
			}
			return maxEntry.getKey();			
		}
		else
			return null;
	}

	public String getRandomValue() {
		Random generator = new Random();
		Object[] keys = attributes.keySet().toArray();
		return (String) keys[generator.nextInt(keys.length)];
	}

}
