package practice6.exercise1;

public class BusinessContract extends Contract{

    public BusinessContract(int weeklyHours, double amountOffered, Business business) {
        super(weeklyHours, amountOffered, business);
    }

    @Override
    public boolean isSuitable(Aspirant aspirant) {
        return aspirant.getBusiness() == null || !aspirant.getBusiness().equals(this.getBusiness());
    }
}
