package practice3.exercise4;

import java.util.Vector;

public class Episode extends AbstractElement{

    private boolean isViewed;
    private int qualification;

    public Episode(String tittle, String description){
        super(tittle, description);
        this.isViewed = false;
        this.qualification = -1;
    }

    @Override
    public boolean isViewed() {
        return this.isViewed;
    }

    public void setViewed(boolean viewed) {
        this.isViewed = viewed;
    }

    public int getQualification() {
        return this.qualification;
    }

    public void setQualification(int qualification) {
        if(qualification >= 1 && qualification <= 5)
            this.qualification = qualification;
        else
            System.out.println("El valor " + qualification + " está fuera de rango, por favor la calificación debe ser entre 1 y 5.");
    }

    @Override
    public int getNumberEpisodesWatched(){
        if(this.isViewed)
            return 1;
        else
            return 0;
    }

    @Override
    public double getAverageQualification() {
        return this.getQualification();
    }

    public boolean validateQualification() {
        return this.qualification >= 1 && this.qualification <= 5;
    }

    @Override
    public Vector<Episode> getEpisode(){
        Vector<Episode> aux = new Vector<>();
        aux.add(this);
        return aux;
    }

}
