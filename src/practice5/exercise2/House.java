package practice5.exercise2;

import java.util.Enumeration;
import java.util.Vector;

public class House extends AbstractElement{

    protected Vector<Student> students;
    private int maxStudents;

    public House(int maxStudents){
        this.maxStudents = maxStudents;
        students = new Vector<>();
    }

    public int getMaxStudents(){
        return this.maxStudents;
    }

    public void setMaxStudents(int maxStudents){
        this.maxStudents = maxStudents;
    }

    public void addStudent(Student a){
        if(students.size() < maxStudents && acceptStudent(a))
            students.add(a);
    }

    public void removeStudent(Student a){
        students.remove(a);
    }

    public boolean acceptStudent(Student a){
        if(a.getHouse() != null)
            return false;
        Enumeration e = qualities.keys();
        boolean exit = false;
        while ( e.hasMoreElements() && !exit ){
            String keyHouse = (String) e.nextElement();
            Object valueHouse = qualities.get(keyHouse);
            try{
                Object valueStudent = a.getQuality(keyHouse);
                if(!valueHouse.equals(valueStudent))
                    return false;
            }catch(Exception b){
                return false;
            }
        }
        return true;
    }
}

//si la casa enemiga lo aceptaria, yo no lo acepto
