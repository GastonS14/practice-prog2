package practice8.exercise3;

import java.util.HashMap;

public class Mailbox {

    private HashMap<Integer, Card> goodBoys;

    public Mailbox() {
        this.goodBoys = new HashMap<>();
    }

    public void addGoodBoy(Integer goodBoy, Card card){
        goodBoys.put(goodBoy, card);
    }

    public void removeGoodBoy(Integer goodBoy){
        goodBoys.remove(goodBoy);
    }

    public void depositCard(Integer goodBoy, Card card){
        if(!goodBoys.containsKey(goodBoy)) {
            card.emptyCard();
            this.addGoodBoy(goodBoy, card);
        }else if(goodBoys.get(goodBoy) == null)
            this.addGoodBoy(goodBoy, card);
    }
}
