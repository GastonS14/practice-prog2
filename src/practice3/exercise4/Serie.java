package practice3.exercise4;

import java.util.Vector;

public class Serie extends AbstractElement{

    private Vector<AbstractElement> season;
    private String author;
    private String genre;

    public Serie(String tittle, String description, String author, String genre){
        super(tittle, description);
        season = new Vector<>();
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean isViewed() {
        for(int i=0; i<season.size();i++){
            if(!season.elementAt(i).isViewed())
                return false;
        }
        return true;
    }

    @Override
    public int getNumberEpisodesWatched() {
        int quantity = 0;
        for (AbstractElement s: season) {
            if(s.isViewed())
                quantity++;
        }
        return quantity;
    }

    public void addSeason(AbstractElement e){
        season.add(e);
    }

    public void removeSeason(AbstractElement e){
        season.remove(e);
    }
}
