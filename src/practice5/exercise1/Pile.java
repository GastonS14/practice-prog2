package practice5.exercise1;

import java.util.Collections;
import java.util.Vector;

public class Pile {

    private Vector<String> pi;

    public Pile(){
        pi = new Vector<>();
    }

    public void push(Object o){
        pi.add( (String) o);
    }

    public void pop(){
        pi.remove(this.top());
    }

    public String top(){
        if(!pi.isEmpty())
            return pi.lastElement();
        return null;
    }

    public int size(){
        return pi.size();
    }

    public Vector<String> copy(){
        return (Vector<String>) pi.clone();
    }

    public Vector<String> reverse(){
        Vector<String> aux = new Vector<>();

        for(int i=pi.size()-1; i>=0; i--)
            aux.add(pi.elementAt(i));

        return aux;
    }

}
