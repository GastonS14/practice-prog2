package practice4.exercise3;

public class EmployeeCommissioned extends Employee{

    private double commissionPercentage;
    private double sale;

    public EmployeeCommissioned(double salary) {
        super(salary);
    }

    @Override
    public double getSalary(){
        return this.salary + this.getSale() * this.getCommissionPercentage();
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(double commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}
