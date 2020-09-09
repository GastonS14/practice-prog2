package practice4.exercise2;

import java.util.Vector;

public class Alarm {

    private Vector<Sensor> sensors;
    protected Doorbell doorbell;

    public Alarm(){
        sensors = new Vector<>();
        doorbell = new Doorbell();
    }

    protected Vector<Sensor> showSign(){
        Vector<Sensor> aux = new Vector<>();
        for(int i=0; i<sensors.size(); i++)
            if(sensors.elementAt(i).detectsIrregularity())
                 aux.add(sensors.elementAt(i));
        return aux;
    }

    public void checkAlert(){
        int count = 0;
         for(Sensor s:sensors){
             System.out.println("Zona en conflicto: " + s.getControlledZoneName());
             count++;
         }
         if(count > 0)
             doorbell.activateAudibleAlarm();
    }

    public void addSensor(Sensor s){
        sensors.add(s);
    }

    public void removeSensor(Sensor s){
        sensors.remove(s);
    }
}
