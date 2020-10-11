package TPE;

public class Main {

    public static void main(String[] args) {

        Card a= new Card();
        Card b = new Card();
        Card c = new Card();

        a.addAttribute("Fuerza", 14);
        a.addAttribute("Inteligencia", 12);
        a.addAttribute("Agilidad", 11);

        Card d = new Card(a);

        b.addAttribute("Fuerza", 14);
        b.addAttribute("Inteligencia", 2);
        b.addAttribute("Agilidad", 2);
        c.addAttribute("fuerza", 28);
        c.addAttribute("Inteligencia", 26);
        c.addAttribute("Agilidad", 24);

        // System.out.println("a es del mismo tipo de carta que d? " + a.containsAllAttributes(d));

        /*
        System.out.println("a es del mismo tipo de carta que b? " + a.containsAllAttributes(b));
        System.out.println("a es del mismo tipo de carta que c? " + a.containsAllAttributes(c));
        System.out.println("b es del mismo tipo de carta que c? " + b.containsAllAttributes(c));
         */

        Deck d1 = new Deck("firstDeck");
        // Deck d2 = new Deck("RandomDeck", a, 28);
        // System.out.println("El mazo creado random es válido? " +d2.validateDeck());

        d1.addValidCard(a);
        d1.addValidCard(b);
        d1.addValidCard(c);

        // System.out.println("el mazo " + d1.getDeckName() + " es válido? " + d1.validateDeck());


        Player p = new Player("Gas");
        Player p2 = new Player("Pab");

        d1.dealCards(p, p2);
        System.out.println("que tiene p? " + p);
        System.out.println("que tiene p2? " + p2);
        System.out.println("que tiene deck? " + d1);
        System.out.println("cualquier cosa");

    }

}
