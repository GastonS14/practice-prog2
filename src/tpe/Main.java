package tpe;

import tpe.gameStrategy.Ambicioso;
import tpe.gameStrategy.GameStrategy;
import tpe.potion.*;

public class Main {

    public static void main(String[] args) {

        Potion porPeso = new ByHigherValueAttribute("Por peso", "peso", 0.5);
        Potion porAltura = new ByHigherValueAttribute("Por altura", "altura", 1.0);
        Potion porPesoPlus = new ByHigherValueAttribute("Por peso plus", "peso", 0.8);
        Potion porAlturaPlus = new ByHigherValueAttribute("Por altura", "altura", 1.5);

        Potion fortalecedora = new ByHigherValue("Fortalecedora", 0.2);
        Potion fortalecedoraPlus = new ByHigherValue("Fortalecedora plus", 0.3);
        Potion fortalecedoraMega = new ByHigherValue("Fortalecedora mega", 0.5);
        Potion fortalecedoraP = new ByHigherValue("Fortalecedora p", 1.0);

        Potion debilitadora = new ByLowerValue("Debilitadora", 0.2);
        Potion debilitadoraP = new ByLowerValue("Debilitadora plus",0.3);
        Potion debilitadorSocial = new ByLowerValue("Debilitador social", 0.9);
        Potion debilitadoraPlus = new ByLowerValue("Debilitadora plus",0.3);

        Potion magicNumber = new ByEqualReturnValue("MagicNumber", 223);
        Potion veintitres = new ByEqualReturnValue("Veintitres",188);
        Potion borracho = new ByEqualReturnValue("Borracho", 14);
        Potion numeroFavorito = new ByEqualReturnValue("Numero favorito",37);

        CompositePotion pocionDaVinciMini = new CompositePotion("Pocion DaVinci Mini");
        CompositePotion pocionDaVinciBarat = new CompositePotion("Pocion DaVinci barat");
        CompositePotion pocionDaVinci = new CompositePotion("Pocion DaVinci");

        pocionDaVinciMini.addPotion(porPeso);
        pocionDaVinciMini.addPotion(debilitadora);
        pocionDaVinciBarat.addPotion(porAltura);
        pocionDaVinciBarat.addPotion(fortalecedora);
        pocionDaVinciBarat.addPotion(debilitadoraP);
        pocionDaVinci.addPotion(fortalecedoraP);
        pocionDaVinci.addPotion(debilitadoraPlus);
        pocionDaVinci.addPotion(pocionDaVinciBarat);

        // Deck deck = new Deck("src/tpe/resources/superheroes.json");
        // Deck deck = new Deck("src/tpe/resources/prueba.json");
        Deck deck = new Deck("src/tpe/resources/invalidDeck.json");

        // GameStrategy gameStrategy = new Timbero();
        // GameStrategy gameStrategy = new Obstinado();
        GameStrategy gameStrategy = new Ambicioso();

        Player Gaston = new Player("Gaston Pauls", gameStrategy);
        Player Pedro = new Player("Pedro Picapiedras", gameStrategy);

        Game game = new Game(60, Gaston, Pedro, deck);

        game.addPotion(porPesoPlus);
        game.addPotion(porAlturaPlus);
        game.addPotion(fortalecedoraPlus);
        game.addPotion(fortalecedoraMega);
        game.addPotion(debilitadorSocial);
        game.addPotion(magicNumber);
        game.addPotion(veintitres);
        game.addPotion(borracho);
        game.addPotion(numeroFavorito);
        game.addPotion(pocionDaVinciMini);
        game.addPotion(pocionDaVinci);

        game.play();

    }

}