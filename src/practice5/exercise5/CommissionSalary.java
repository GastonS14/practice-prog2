package practice5.exercise5;

public class CommissionSalary extends Salary{

    private FixedSalary fixedSalary;
    private double commissionPercentage;
    private double sale;

    public CommissionSalary(FixedSalary fixedSalary, double commissionPercentage, double sale){
        this.fixedSalary = fixedSalary;
        this.commissionPercentage = commissionPercentage;
        this.sale = sale;
    }

    public FixedSalary getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(FixedSalary fixedSalary) {
        this.fixedSalary = fixedSalary;
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

    @Override
    public double getSalary() {
        return fixedSalary.getSalary() + commissionPercentage * sale;
    }
}
