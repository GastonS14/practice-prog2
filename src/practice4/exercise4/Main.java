package practice4.exercise4;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        SoccerPlayer mesias = new SoccerPlayer("leo", "messi", "BB45", LocalDate.of(1990, 4, 4), "lateral izquierdo", SkillfullLeg.RIGHT, 1);
        SoccerPlayer mesisas = new SoccerPlayer("leo", "messi", "BB4ds5", LocalDate.of(1990, 4, 4), "lateral derecho", SkillfullLeg.LEFT_RIGHT, 18);

        System.out.println( mesias.getDisponible());
       ;


    }

}
