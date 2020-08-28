package practice3.exercise4;

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
        return qualification;
    }

    public void setQualification(int qualification) {
        if(qualification < 1 || qualification > 5)
            System.out.println("El valor está fuera de rango, por favor la calificaciíón es entre 1 y 5");
        else
            this.qualification = qualification;
    }

    @Override
    public int getNumberEpisodesWatched(){
        if(this.isViewed)
            return 1;
        else
            return 0;
    }

}
