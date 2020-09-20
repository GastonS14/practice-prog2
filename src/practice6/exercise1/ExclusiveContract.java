package practice6.exercise1;

public class ExclusiveContract extends Contract{

    public ExclusiveContract(int weeklyHours, double amountOffered, Business business) {
        super(weeklyHours, amountOffered, business);
    }

    @Override
    public boolean isSuitable(Aspirant aspirant) {
        return aspirant.getBusiness() == null;
    }
}
