package tpe;

import tpe.potion.Potion;

import java.util.*;

public class Card {

    private String heroName;
    private Potion potion;
    private HashMap<String, Integer> attributes;

    public Card(String heroName){
        this.heroName = heroName;
        attributes = new HashMap<>();
    }

    public Card getCopy(){
        return new Card(this.heroName);
    }

    public Potion getPotion() {
        return potion;
    }

    public void setPotion(Potion potion) {
        this.potion = potion;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void addAttribute(String s,Integer b){
        attributes.put(s.toLowerCase(), b);
    }

    public ArrayList<String> getAttributesName(){
        return new ArrayList<>(attributes.keySet());
    }

    public boolean containsAllAttributes(Card modelCard){
        return modelCard.validateCard(this);
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

    public Integer getValueAttribute(String key){
        try{
            return this.attributes.get(key);
        }catch(Exception e){
            e.fillInStackTrace();
        }
        return null;
    }

    public String getRandomAttribute(){
        List<String> attributeList = this.getAttributesName();
        Collections.shuffle(attributeList);
        return attributeList.get(0);
    }

    //---------------------------------------------------------

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

    public boolean hasAttribute(String key) {
        return attributes.containsKey(key);
    }

    public int numberOfAttributes() {
        return attributes.size();
    }

}
