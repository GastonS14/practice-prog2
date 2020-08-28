package practice3.exercise1;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Persona p = new Persona(45);
        Persona p1 = new Persona(45, "Gaston", "Sanchez");
        LocalDate birthDay = LocalDate.of(2003, 8, 27);
        Persona p2 = new Persona(45, "Rodrigo", "Cabrera", birthDay);


        System.out.println("Masa corporal: " + p.getBodyMassIndex());
        System.out.println("Es mi cumpleaños?: " + p2.isBirthDay());
        System.out.println(p2.isAgeSuffrage());
        System.out.println(p2.isAdult());
        System.out.println(p2.toString());

    }

}
