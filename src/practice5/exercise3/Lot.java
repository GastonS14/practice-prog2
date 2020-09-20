package practice5.exercise3;

import java.util.Vector;

public class Lot {

    public Vector<String> minerales;

    public Lot(){
        minerales = new Vector<>();
    }

    public void addMineral(String s){
        minerales.add(s);
    }

    public void removeMineral(String s){
        minerales.remove(s);
    }
}