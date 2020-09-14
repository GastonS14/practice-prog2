package practice4.exercise3;

public class Employee {

    protected double salary;

    public Employee(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
