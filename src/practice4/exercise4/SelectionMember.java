package practice4.exercise4;

import java.time.LocalDate;

public class SelectionMember {

    private String name;
    private String surname;
    private String passport;
    private LocalDate birthDate;
    private State state;

    public SelectionMember(String name, String surname, String passport, LocalDate birthDate){
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.birthDate = birthDate;
        this.state = State.PAIS_ORIGEN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean getDisponible(){
        return this.getState() == State.PAIS_ORIGEN && this.getState() != State.CONCENTRACION;
    }
}
