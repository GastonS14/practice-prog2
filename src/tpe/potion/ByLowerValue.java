package tpe.potion;

import tpe.Card;

public class ByLowerValue extends Potion {

    private double percentage;

    public ByLowerValue(String name, double percentage) {
        super(name);
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public int getValue(Card card, String attribute) {
        int value = card.getValueAttribute(attribute);
        return (int) (value - value * percentage);
    }

}
