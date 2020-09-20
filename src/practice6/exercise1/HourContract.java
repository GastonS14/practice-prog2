package practice6.exercise1;

public class HourContract extends Contract{

    public HourContract(int weeklyHours, double amountOffered, Business business) {
        super(weeklyHours, amountOffered, business);
    }

    @Override
    public boolean isSuitable(Aspirant aspirant) {
        return aspirant.getMaxHoursAccepted() >= this.weeklyHours;
    }
}
