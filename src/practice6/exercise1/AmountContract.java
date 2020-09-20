package practice6.exercise1;

public class AmountContract extends Contract{

    public AmountContract(int weeklyHours, double amountOffered, Business business) {
        super(weeklyHours, amountOffered, business);
    }

    @Override
    public boolean isSuitable(Aspirant aspirant) {
        return aspirant.getActualSalary() < this.getAmountOffered();
    }
}
