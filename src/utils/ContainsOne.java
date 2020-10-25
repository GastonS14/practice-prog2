package utils;

import java.util.ArrayList;

public class ContainsOne {

    private ArrayList arrayList;

    public ContainsOne(){
        arrayList = new ArrayList();
    }

    public boolean containsOne(ArrayList a){
        for (Object o : a)
            if (arrayList.contains(o))
                return true;
        return false;
    }

    public void addVector(Object o){
        arrayList.add(o);
    }

    public void removeVector(Object o){
        arrayList.remove(o);
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


