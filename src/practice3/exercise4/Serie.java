package practice3.exercise4;

import java.util.Vector;

public class Serie extends AbstractElement{

    private Vector<AbstractElement> season;
    private String author;
    private String genre;

    public Serie(String tittle, String description){
        super(tittle, description);
        season = new Vector<>();
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
        for (AbstractElement s: season)
            quantity += s.getNumberEpisodesWatched();
        return quantity;
    }

    public void addSeason(AbstractElement e){
        season.add(e);
    }

    public void removeSeason(AbstractElement e){
        season.remove(e);
    }

    @Override
    public double getAverageQualification(){
        double sum = 0;
        int quantity = 0;
        Vector<Episode> episodes = this.getEpisode();
        for(Episode e:episodes){
            if(e.isViewed() && e.validateQualification()){
                sum += e.getQualification();
                quantity++;
            }
        }

        return sum/quantity;
    }

    @Override
    public Vector<Episode> getEpisode(){
        Vector<Episode> aux = new Vector<Episode>();
        for(AbstractElement s: season)
            aux.addAll(s.getEpisode());
        return aux;
    }

}
