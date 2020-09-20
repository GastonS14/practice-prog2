package practice5.exercise5;

public class FixedSalary extends Salary{

    private double amount;

    public FixedSalary(int amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public double getSalary() {
        return this.amount;
    }
}
