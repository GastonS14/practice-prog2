package practice6.exercise1;

import java.util.Vector;

public class Business {

    private int id;
    private Contract contract;
    private Vector<Aspirant> aspirants;


    public Business(int id){
        this.id = id;
        aspirants = new Vector<>();
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public void addAspirant(Aspirant aspirant){
        aspirants.add(aspirant);
    }

    public void removeAspirant(Aspirant aspirant){
        aspirants.remove(aspirant);
    }

    public Vector<Aspirant> getAspirants(){
        Vector<Aspirant> aux = new Vector<>();
        for(int i=0; i<aspirants.size(); i++){
            Aspirant a = aspirants.elementAt(i);
            if(a.isSuitable(this.contract))
                aux.add(a);
        }
        return aux;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        return this.id == ((Business) o).id;
    }

}
