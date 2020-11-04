package tpe.potion;

import tpe.Card;

public abstract class Potion {

    private String name;

    public Potion(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract int getValue(Card card, String attribute);

}