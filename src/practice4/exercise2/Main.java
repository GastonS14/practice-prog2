package practice4.exercise2;

public class Main {

    public static void main(String[] args) {

        Sensor s = new Sensor("Zona A");
        Sensor s1 = new Sensor("Zona Z");
        Alarm a = new Alarm();

        a.addSensor(s);
        a.addSensor(s1);

        a.checkAlert();

    }

}
