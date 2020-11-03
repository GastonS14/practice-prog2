package tpe.gameStrategy;

import tpe.Card;

public class Obstinado extends GameStrategy{

    // Elige siempre el mismo atributo para competir, ronda tras ronda.

    private String attribute;
    private boolean isChosen;

    public Obstinado(){
        this.isChosen = false;
    }

    @Override
    public String getAttribute(Card card) {
        if(!isChosen){
            attribute = card.getRandomAttribute();
            isChosen = true;
        }
        return attribute;

    }
}
