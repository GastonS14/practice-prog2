package practice3.exercise4;

public class Main {

    public static void main(String[] args) {

        Serie gameOfThrones = new Serie("Game of thrones", "Serie animada de aventura");
        Serie seasonGOT = new Serie("Season 1", "Mejor season");

        gameOfThrones.addSeason(seasonGOT);

        Episode e = new Episode("Winter is coming", "the first cap");
        Episode e1 = new Episode("The Kingsroad.", "the second cap");
        Episode e2 = new Episode("Lord Snow", "the third cap");
        Episode e3 = new Episode("Ingrid.", "the fourth cap");
        Episode e4 = new Episode("Lord", "the fifth cap");
        Episode e5 = new Episode("Lord", "the fifth cap");

        gameOfThrones.addSeason(e);
        gameOfThrones.addSeason(e1);
        gameOfThrones.addSeason(e2);
        seasonGOT.addSeason(e3);
        seasonGOT.addSeason(e4);
        seasonGOT.addSeason(e5);

        e.setViewed(true);
        e1.setViewed(true);
        e2.setViewed(false);
        e3.setViewed(true);
        e4.setViewed(true);
        e5.setViewed(true);

        System.out.println("Vi el episodio? " + e.isViewed());
        System.out.println("Vi el episodio? " + e1.isViewed());
        System.out.println("Vi toda la serie? " + gameOfThrones.isViewed());
        System.out.println("Vi toda la temporada? " + seasonGOT.isViewed());
        System.out.println("Cantidad de episodios visto en serie " + gameOfThrones.getNumberEpisodesWatched());
        System.out.println("Cantidad de episodios visto en temporada " + seasonGOT.getNumberEpisodesWatched());

        e.setQualification(1);
        e1.setQualification(3);
        e2.setQualification(5);
        e3.setQualification(2);
        e4.setQualification(5);
        e5.setQualification(9);

        System.out.println("El promedio de la serie es " + gameOfThrones.getAverageQualification());
        System.out.println("El promedio de la temporada es " + seasonGOT.getAverageQualification());
    }

}
