package tpe.potion;

import tpe.Card;

public class ByEqualReturnValue extends Potion {

    private int returnedValue;

    public ByEqualReturnValue(String name, int returnedValue) {
        super(name);
        this.returnedValue = returnedValue;
    }

    public int getReturnedValue() {
        return returnedValue;
    }

    public void setReturnedValue(int returnedValue) {
        this.returnedValue = returnedValue;
    }

    @Override
    public int getValue(Card card, String attribute) {
        return returnedValue;
    }


}