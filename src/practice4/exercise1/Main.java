package practice4.exercise1;

public class Main {

    public static void main(String[] args) {

        Alarm a = new Alarm();
        Alarm b = new Alarm(false, false, true, false);
        a.checkAlert();
        b.checkAlert();
    }

}
