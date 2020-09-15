package practice4.exercise4;

import java.time.LocalDate;

public class SoccerPlayer extends SelectionMember{

    private String position;
    private SkillfullLeg skillfulLeg;
    private int goalsScored;

    public SoccerPlayer(
            String name, String surname, String passport, LocalDate birthDate, String position, SkillfullLeg skillfulLeg, int goalsScored
    ){
        super(name, surname, passport, birthDate);
        this.position = position;
        this.skillfulLeg = skillfulLeg;
        this.goalsScored = goalsScored;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public SkillfullLeg isSkillfulLeg() {
        return skillfulLeg;
    }

    public void setSkillfulLeg(SkillfullLeg skillfulLeg) {
        this.skillfulLeg = skillfulLeg;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }
}

