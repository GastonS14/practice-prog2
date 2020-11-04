package tpe.potion;

import tpe.Card;

public class ByHigherValueAttribute extends Potion {

    private String attribute;
    private double percentage;

    public ByHigherValueAttribute(String name, String attribute, double percentage) {
        super(name);
        this.attribute = attribute.toLowerCase();
        this.percentage = percentage;
        super.setName(name);
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
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
        if(this.attribute.equals(attribute)){
            return (int) (value + value * percentage);
        }
        else
            return 0;
    }

    @Override
    public boolean hasApplied(){
        return true;
    }
}
