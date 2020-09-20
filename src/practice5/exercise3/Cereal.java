package practice5.exercise3;

import java.util.Vector;

public class Cereal {

    public Vector<String> mineralesRequeridos;

    public Cereal(){
        mineralesRequeridos = new Vector<>();
    }

    public void addMineral(String s){
        mineralesRequeridos.add(s);
    }

    public void removeMineral(String s){
        mineralesRequeridos.remove(s);
    }
}