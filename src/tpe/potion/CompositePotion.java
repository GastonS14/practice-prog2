package tpe.potion;

import tpe.Card;

import java.util.ArrayList;

public class CompositePotion extends Potion {

    private ArrayList<Potion> potions;

    public CompositePotion(String name) {
        super(name);
        this.potions = new ArrayList<>();
    }

    public void addPotion(Potion potion) {
        potions.add(potion);
    }

    @Override
    public int getValue(Card card, String attribute) {
        int value;
        for (Potion potion : potions){
            value = potion.getValue(card, attribute);
            if(value != card.getValueAttribute(attribute))
                card.setAttribute(attribute, value);
        }
        return card.getValueAttribute(attribute);
    }
}