package tpe.gameStrategy;

import tpe.Card;

public class Timbero extends GameStrategy {

    // el jugador elige al azar el atributo por el cual se desea competir

    @Override
    public String getAttribute(Card card) {
        return card.getRandomAttribute();
    }
}