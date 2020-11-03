package tpe.gameStrategy;

import tpe.Card;

import java.util.Map;

public class Ambicioso extends GameStrategy {

    // El jugador elige el atributo que posea el mayor valor de su carta del turno.
    @Override
    public String getAttribute(Card card) {
        // Selecciono el primer entry
        Map.Entry<String, Integer> maxEntry = card.getAttributes().entrySet().iterator().next();
        if (maxEntry != null) {
            for (Map.Entry<String, Integer> entry : card.getAttributes().entrySet()) {
                if (entry.getValue() > maxEntry.getValue())
                    maxEntry = entry;
            }
            return maxEntry.getKey();
        }
        else
            return null;
    }

}
