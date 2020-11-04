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

    /**
     * 1-Obtener el valor del atributo de la carta
     * 2-Recorrer las pociones de la carta e ir stackeando su valor
     * getValueAttribute retorna 0 si la poción no afecta el valor del atributo
     * 3-Si el valor de getValueAttribute es mayor a 0 me quedo con el valor
     * 4-Si no se queda con el valor ya asignado
     * @param card
     * @param attribute
     * @return
     */
    @Override
    public int getValue(Card card, String attribute) {
        int value = card.getValueAttribute(attribute);
        for (Potion potion : potions){
            int getValuePotionApplied = potion.getValue(card, attribute);
            if(getValuePotionApplied > 0)
                value = getValuePotionApplied;
        }
        return value;
    }

}