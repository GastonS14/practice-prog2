package tpe.potion;

public abstract class Potion {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // public abstract int getValor(Card card, String attribute);

    public abstract boolean hasAttribute(String key);

}