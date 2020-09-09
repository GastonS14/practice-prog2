package practice4.exercise1;

import java.util.Vector;

public class Alarm {

    private Vector<Boolean> isSafe;
    protected Doorbell doorbell;

    public Alarm(){
        isSafe = new Vector<>();
        doorbell = new Doorbell();
    }

    public Alarm(Boolean brokenGlass, boolean openWindow, boolean openDoor, boolean detectedMovement){
        isSafe = new Vector<>();
        doorbell = new Doorbell();
        isSafe.add(brokenGlass);
        isSafe.add(openWindow);
        isSafe.add(openDoor);
        isSafe.add(detectedMovement);
    }

    protected boolean showSign(){
        for(int i=0; i<isSafe.size(); i++){
            if(isSafe.elementAt(i))
                return true;
        }
        return false;
    }

    public void checkAlert(){
         if(showSign())
             doorbell.activateAudibleAlarm();
    }

    public void addQualitySafety(Boolean quality){
        isSafe.add(quality);
    }

    public void removeQualitySafety(Boolean quality){
        isSafe.remove(quality);
    }
}
