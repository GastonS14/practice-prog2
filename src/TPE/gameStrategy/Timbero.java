package tpe.gameStrategy;

import tpe.Card;

import java.util.Collections;
import java.util.List;

public class Timbero extends GameStrategy {

    // el jugador elige al azar el atributo por el cual se desea competir

    @Override
    public String getAttribute(Card card) {
        List<String> attributeList = card.getAttributesName();
        Collections.shuffle(attributeList);
        return attributeList.get(0);
    }
}