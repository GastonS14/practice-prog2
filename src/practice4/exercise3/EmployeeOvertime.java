package practice4.exercise3;

public class EmployeeOvertime extends Employee{

    private int hoursWorked;
    private double amountPerHourWorked;

    public EmployeeOvertime(double salary) {
        super(salary);
    }

    @Override
    public double getSalary(){
        return this.salary + hoursWorked * amountPerHourWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getAmountPerHourWorked() {
        return amountPerHourWorked;
    }

    public void setAmountPerHourWorked(double amountPerHourWorked) {
        this.amountPerHourWorked = amountPerHourWorked;
    }
}
