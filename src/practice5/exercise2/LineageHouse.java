package practice5.exercise2;

public class LineageHouse extends House{

    public LineageHouse(int maxStudents){
        super(maxStudents);
    }

    @Override
    public boolean acceptStudent(Student a){
        return true;
    }
}
