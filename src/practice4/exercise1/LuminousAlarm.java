package practice4.exercise1;

public class LuminousAlarm extends Alarm{

    private Light light;

    public LuminousAlarm(){
        light = new Light();
    }

    @Override
    public void checkAlert(){
        if(this.showSign()){
            doorbell.activateAudibleAlarm();
            light.activateLightAlarm();
        }
    }
}
