package practice5.exercise2;

import java.util.Vector;

public class Student extends AbstractElement{

    private String name;
    private Vector<String> relatives;
    private House house;

    public Student(String name){
        this.name = name;
        relatives = new Vector<>();
        house = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRelatives(String q) {
        relatives.add(q);
    }

    public void removeRelatives(String q) {
        relatives.remove(q);
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Vector<String> getRelatives(){
        return (Vector<String>) relatives.clone();
    }

    public void requestAdmission(House h){

    }
}
