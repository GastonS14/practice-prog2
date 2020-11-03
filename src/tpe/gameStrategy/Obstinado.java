package tpe.gameStrategy;

import tpe.Card;

import java.util.Collections;
import java.util.List;

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
            List<String> attribute = card.getAttributesName();
            Collections.shuffle(attribute);
            isChosen = true;
            return attribute.get(0);
        }
        return attribute;
    }
}
