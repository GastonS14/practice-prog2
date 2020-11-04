package tpe;

import tpe.gameStrategy.GameStrategy;
import tpe.gameStrategy.Timbero;
import tpe.potion.ByHigherValueAttribute;
import tpe.potion.CompositePotion;
import tpe.potion.Potion;

public class Main {

    public static void main(String[] args) {

        Potion p = new ByHigherValueAttribute("por peso", "peso", 0.5);
        Potion p1 = new ByHigherValueAttribute("por altura", "peso", 1.0);
        Potion p2 = new ByHigherValueAttribute("por velocidad", "velocidad", 2.0);
        Potion p3 = new ByHigherValueAttribute("por peso4", "peso", 0.1);

        CompositePotion pc = new CompositePotion("pocima compuesta");
        pc.addPotion(p);
        pc.addPotion(p1);


        // Deck deck = new Deck("src/tpe/resources/superheroes.json");
        // Deck deck = new Deck("src/tpe/resources/prueba.json");
        // Deck deck = new Deck("src/tpe/resources/invalidDeck.json");
        Deck deck = new Deck("src/tpe/resources/prueba.json");
        GameStrategy gameS = new Timbero();

        Player a = new Player("Gaston", gameS);
        Player b = new Player("Pedro", gameS);

        Game game = new Game(3, a, b, deck);
        /*game.addPotion(p);
        game.addPotion(p1);
        game.addPotion(p2);
        game.addPotion(p3);
         */
        game.addPotion(pc);

        game.play();


        // VisorMazo.mostrarMazo("src/tpe/resources/superheroes.json");
        // MapObject.convertToObject("src/tpe/resources/superheroes.json");

    }

}