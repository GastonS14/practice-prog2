package practice6.exercise1;

public abstract class Contract {

    protected int weeklyHours;
    protected double amountOffered;
    private Business business;

    public Contract(int weeklyHours, double amountOffered, Business business) {
        this.weeklyHours = weeklyHours;
        this.amountOffered = amountOffered;
        this.business = business;
    }

    public int getWeeklyHours() {
        return weeklyHours;
    }

    public void setWeeklyHours(int weeklyHours) {
        this.weeklyHours = weeklyHours;
    }

    public double getAmountOffered() {
        return amountOffered;
    }

    public void setAmountOffered(double amountOffered) {
        this.amountOffered = amountOffered;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public abstract boolean isSuitable(Aspirant aspirant);
}
