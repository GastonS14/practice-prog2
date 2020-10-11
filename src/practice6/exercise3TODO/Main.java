package practice6.exercise3TODO;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate a = LocalDate.now();
        int year = a.getYear();
        int month =  a.getMonthValue();
        int day = a.getDayOfMonth() + 15;
        a = LocalDate.of(year, month, day);
        System.out.println(a);
        System.out.println(a.getDayOfMonth());
    }

}
