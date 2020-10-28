package TPE;

import java.util.*;

public class Card {

    public static final int MAX_RANDOM = 100;
    private HashMap<String, Integer> attributes;

    public Card(){
        attributes = new HashMap<>();
    }

    /**
     * Create random card
     * @param modelCard should be the cardArchetype to create the deck
     */
    public Card(Card modelCard) {
        this();
        this.attributes = new HashMap<>();
        ArrayList<String> aux = modelCard.getAttributesName();
        for (String s : aux)
            this.addAttribute(s, modelCard.getValueAttribute(s));
    }

    private int getRandom(){
        return (int) (Math.random() * MAX_RANDOM);
    }

    public void addAttribute(String s,Integer b){
        attributes.put(s.toLowerCase(), b);
    }

    public void removeAttribute(String s){
        attributes.remove(s);
    }

    public HashMap<String, Integer> getAttributes(){
        return (HashMap<String, Integer>) this.attributes.clone();
    }

    public ArrayList<String> getAttributesName(){
        return new ArrayList<>(attributes.keySet());
    }

    public boolean containsAllAttributes(Card modelCard){
        return modelCard.validateCard(this);
    }

    @Deprecated(since = "Should be compare between key and values, actually only for keys")
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;

        for (Map.Entry<String, Integer> actual: this.attributes.entrySet())
            if(card.attributes.get(actual.getKey()) == null)
                return false;
        return true;
    }

    /**
     * @param c card to be validated
     * @return card with the same attributes as this
     */
    public boolean validateCard(Card c){
        Set<String> card = this.attributes.keySet();
        Set<String> modelCard = c.attributes.keySet();

        return card.equals(modelCard);
    }

    public int getValueAttribute(String key){
        try{
            return this.attributes.get(key);
        }catch(Exception e){
            e.fillInStackTrace();
        }
        return -1;
    }

}
