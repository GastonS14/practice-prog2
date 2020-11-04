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

    public boolean hasPotion(){
        return potion != null;
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

    public void setAttribute(String attribute, int value){
        if(attributes.containsKey(attribute))
            attributes.put(attribute, value);
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

    public HashMap<String, Integer> getAttributes(){
        return (HashMap<String, Integer>) this.attributes.clone();
    }


}
