package TPE;

public class Main {

    public static void main(String[] args) {

    	// Creo cartas
        Card c1 = new Card("Superman");
        Card c2 = new Card("Flash");
        Card c3 = new Card("Firestorm");
        Card c4 = new Card("Manhunter");

        // Les agrego atributos
        c1.addAttribute("Altura", 205);
        c1.addAttribute("Peso", 110);
        c1.addAttribute("Fuerza", 2000);
        c1.addAttribute("Peleas ganadas", 990);
        c1.addAttribute("Velocidad", 400);
        
        c2.addAttribute("Altura", 195);
        c2.addAttribute("Peso", 90);
        c2.addAttribute("Fuerza", 840);
        c2.addAttribute("Peleas ganadas", 900);
        c2.addAttribute("Velocidad", 500000);

        c3.addAttribute("Altura", 175);
        c3.addAttribute("Peso", 70);
        c3.addAttribute("Fuerza", 700);
        c3.addAttribute("Peleas ganadas", 855);
        c3.addAttribute("Velocidad", 220);

        c4.addAttribute("Altura", 185);
        c4.addAttribute("Peso", 85);
        c4.addAttribute("Fuerza", 400);
        c4.addAttribute("Peleas ganadas", 950);
        c4.addAttribute("Velocidad", 85);

        // Creo estrategia de juego
        GameStrategy timbero = new Timbero();
        
        // Creo jugadores
        Player p1 = new Player("Gaston", timbero);
        Player p2 = new Player("Mariano", timbero);

        // Creo mazo
        Deck deck = new Deck();
        
        // Le agrego cartas
        deck.addCard(c1);
        deck.addCard(c2);
        deck.addCard(c3);
        deck.addCard(c3);
        deck.addCard(c3);
        deck.addCard(c3);
        deck.addCard(c4);
                
        // Creo juego
        Game juego = new Game(p1, p2, deck, 8);

        // Lo juego
        for (int i = 0; i < juego.getMaxRounds(); i++) {
        	juego.play();        	
        }
        

    }

}