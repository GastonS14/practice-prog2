package practice5.exercise5;

public class Employee {

    private String name;
    private String surname;
    private int dni;
    private Salary salary;

    public Employee(String name, String surname, int dni, Salary salary){
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public double getAmountSalary() {
        return salary.getSalary();
    }
}
