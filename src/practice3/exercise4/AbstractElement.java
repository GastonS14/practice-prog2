package practice3.exercise4;

public abstract class AbstractElement {

    private String tittle;
    private String description;

    public AbstractElement(String tittle, String description){
        this.tittle = tittle;
        this.description = description;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract boolean isViewed();

    public abstract int getNumberEpisodesWatched();
}
