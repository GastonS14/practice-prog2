package practice5.exercise2;

import java.util.Hashtable;

public abstract class AbstractElement {

    protected Hashtable<String, Object> qualities;

    public AbstractElement(){
        qualities = new Hashtable<>();
    }

    public Object getQuality(String s){
        return qualities.get(s);
    }

    public void addQuality(String s, Object o){
        qualities.put(s, o);
    }

    public void removeQuality(String s){
        qualities.remove(s);
    }
}
