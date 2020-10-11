package practice6.exercise3TODO;

public class Film extends Product{

    private String filmInformation;
    private int copiesCount;

    public Film(int id, String name, String filmInformation, int copiesCount) {
        super(id, name);
        this.filmInformation = filmInformation;
        this.copiesCount = copiesCount;
    }

    public String getFilmInformation() {
        return filmInformation;
    }

    public void setFilmInformation(String filmInformation) {
        this.filmInformation = filmInformation;
    }

    public int getCopiesCount() {
        return copiesCount;
    }

    public void setCopiesCount(int copiesCount) {
        this.copiesCount = copiesCount;
    }

    @Override
    public boolean isAvailable() {
        return copiesCount > 0;
    }

    public void removeCopy(){
        if (copiesCount > 0)
            copiesCount--;
    }
}
