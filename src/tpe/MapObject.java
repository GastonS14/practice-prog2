package tpe;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MapObject {

    public static Deck convertToObject(String jsonFile) {
        File jsonInputFile = new File(jsonFile);
        InputStream is;
        try {
            is = new FileInputStream(jsonInputFile);
            // Creo el objeto JsonReader de Json.
            JsonReader reader = Json.createReader(is);
            // Obtenemos el JsonObject a partir del JsonReader.
            JsonArray cartas = reader.readObject().getJsonArray("cartas");
            Deck deck = new Deck();
            for (JsonObject carta : cartas.getValuesAs(JsonObject.class)) {
                String nombreCarta = carta.getString("nombre");
                JsonObject atributos = carta.getJsonObject("atributos");
                Card c = new Card(nombreCarta);
                for (String nombreAtributo : atributos.keySet())
                    c.addAttribute(nombreAtributo, atributos.getInt(nombreAtributo));
                deck.addCard(c);
            }
            reader.close();

            return deck;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
