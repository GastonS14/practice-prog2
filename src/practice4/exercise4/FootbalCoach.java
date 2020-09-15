package practice4.exercise4;

import java.time.LocalDate;

public class FootbalCoach extends SelectionMember{

    private int footbalCoachId;

    public FootbalCoach(String name, String surname, String passport, LocalDate birthDate, int footbalCoachId){
        super(name, surname, passport, birthDate);
        this.footbalCoachId = footbalCoachId;
    }

    public int getFootbalCoachId() {
        return footbalCoachId;
    }

    public void setFootbalCoachId(int footbalCoachId) {
        this.footbalCoachId = footbalCoachId;
    }
}
