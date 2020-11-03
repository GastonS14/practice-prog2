package tpe;

public class Main {

    public static void main(String[] args) {

        Card a1= new Card("a");
        Card b1 = new Card("b");
        Card c1 = new Card("c");
        Card d1 = new Card("d");

        a1.addAttribute("Fuerza", 1);
        a1.addAttribute("Inteligencia", 11);
        a1.addAttribute("Agilidad", 111);
        b1.addAttribute("Fuerza", 2);
        b1.addAttribute("Inteligencia", 22);
        b1.addAttribute("Agilidad", 222);
        c1.addAttribute("fuerza", 4);
        c1.addAttribute("Inteligencia", 44);
        c1.addAttribute("Agilidad", 444);
        d1.addAttribute("fuerza", 3);
        d1.addAttribute("Inteligencia", 33);
        d1.addAttribute("Agilidad", 333);

        /*
         Player a = new Player("Gaston");
         Player b = new Player("Mariano");

        Deck deck = new Deck();
        deck.addCard(a1);
        deck.addCard(b1);
        deck.addCard(c1);
        deck.addCard(d1);

        GameStrategy gameS = new EasyGameStrategy(4);
        Game game = new Game("prueba", a, b, deck, gameS);
        game.playGame();

         */


    }

}