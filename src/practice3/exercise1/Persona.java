package practice3.exercise1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Persona {

    private static final double MIN_MASS_INDEX = 18.5;
    private static final double MAX_MASS_INDEX = 25.0;
    private static final int AGE_ADULT = 18;
    private static final int AGE_SUFFRAGE = 16;

    private final int dni;
    private LocalDate birthDate;
    private Sex sex;
    private String name;
    private String surname;
    private double weight;
    private double height;

    public Persona(int dni) {
        this.dni = dni;
        this.sex = Sex.FEMENINO;
        this.name = "N";
        this.surname = "N";
        this.weight = 1;
        this.height = 1;
        this.birthDate = LocalDate.of(2000, 1, 1);
    }

    public Persona(int dni, String name, String surname) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }

    public Persona(int dni, String name, String surname, LocalDate birthDate) {
        this(dni, name, surname);
        this.birthDate = birthDate;
    }

    public int getDni() {
        return dni;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyMassIndex(){
        return this.weight/this.height*this.height;
    }

    public boolean isFit() {
        return this.getBodyMassIndex() > MIN_MASS_INDEX && this.getBodyMassIndex() < MAX_MASS_INDEX;
    }

    public int getAge(){
        LocalDate actualDate = LocalDate.now();
        Period period = Period.between(this.birthDate, actualDate);
        return period.getYears();
    }

    public boolean isBirthDay(){
        LocalDate actualDate = LocalDate.now();
        int actualDay = actualDate.getDayOfMonth();
        Month actualMonth = actualDate.getMonth();
        return actualDay == this.getBirthDate().getDayOfMonth() && actualMonth == this.getBirthDate().getMonth();
    }

    public boolean isAdult(){
        return this.getAge() >= AGE_ADULT;
    }

    public boolean isAgeSuffrage(){
        return this.getAge() >= AGE_SUFFRAGE;
    }

    @Override
    public String toString(){
        return "DNI: " + this.getDni() +
                ", Name: " + this.getName() +
                ", Surname: " + this.getSurname();
    }
}
