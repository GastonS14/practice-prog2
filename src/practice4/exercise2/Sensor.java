package practice4.exercise2;

public class Sensor {

    private String controlledZoneName;

    public Sensor(String controlledZoneName){
        this.controlledZoneName = controlledZoneName;
    }

    public boolean detectsIrregularity(){
        return true;
    }

    public String getControlledZoneName(){
        return this.controlledZoneName;
    }

    public void setControlledZoneName(String controlledZoneName){
        this.controlledZoneName = controlledZoneName;
    }
}
