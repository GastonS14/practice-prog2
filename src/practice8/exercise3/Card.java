package practice8.exercise3;

import java.util.ArrayList;

public class Card {

    private static final String EMPTY_PRESENT = "Trozo de carbon";

    private String sender;
    private ArrayList<String> presents;

    public Card(String sender) {
        this.sender = sender;
        this.presents = new ArrayList<>();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void addPresent(String present){
        presents.add(present);
    }

    public void removePresent(String present){
        presents.remove(present);
    }

    private void removeAllPresents(){
        presents.removeAll(presents);
    }

    public void emptyCard(){
        this.removeAllPresents();
        this.presents.add(EMPTY_PRESENT);
    }
}
