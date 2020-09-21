package utils;

import java.util.Vector;

public class ContainsOne {

    private Vector vector;

    public ContainsOne(){
        vector = new Vector();
    }

    public boolean containsOne(Vector v){
        for(int i=0; i<v.size(); i++)
            if(vector.contains(v.elementAt(i)))
                return true;
        return false;
    }

    public void addVector(Object o){
        vector.add(o);
    }

    public void removeVector(Object o){
        vector.remove(o);
    }

    /*
    //Ascendent order
    Collections.sort(List);
    //Descendent Order
    Collections.reverse(List);
    //Get the first element
    List.elelementAt(0)
     */

}


