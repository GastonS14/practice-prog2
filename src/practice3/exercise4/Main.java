package practice3.exercise4;

public class Main {

    public static void main(String[] args) {

        Serie gameOfThrones = new Serie(
                "Game of thrones",
                "Serie animada de aventura",
                "George RR Martin",
                "Aventura"
        );

        // Serie seasonGOT = new Serie();

        Episode e = new Episode("Winter is coming", "the first cap");
        Episode e1 = new Episode("The Kingsroad.", "the second cap");
        Episode e2 = new Episode("Lord Snow", "the third cap");

        gameOfThrones.addSeason(e);
        gameOfThrones.addSeason(e1);
        gameOfThrones.addSeason(e2);

        e.setViewed(true);
        e1.setViewed(true);
        // e2.setViewed(true);
        gameOfThrones.isViewed();

        System.out.println(e.isViewed());
        System.out.println(e1.isViewed());
        System.out.println(gameOfThrones.isViewed());
        System.out.println(gameOfThrones.getNumberEpisodesWatched());
    }

}
