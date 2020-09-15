package practice4.exercise4;

import java.time.LocalDate;
import java.util.Vector;

public class MassageTherapist extends SelectionMember{

    private Vector<String> titles;
    private int experience;

    public MassageTherapist(String name, String surname, String passport, LocalDate birthDate, int experience){
        super(name, surname, passport, birthDate);
        titles = new Vector<>();
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void addTitle(String title){
        titles.add(title);
    }

    public void removeTitle(String title){
        titles.remove(title);
    }
}
