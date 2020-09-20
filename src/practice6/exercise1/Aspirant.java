package practice6.exercise1;

public class Aspirant {

    private String name;
    private Business business;
    private double actualSalary;
    private int maxHoursAccepted;

    public Aspirant(String name, Business business, double actualSalary, int maxHoursAccepted){
        this.name = name;
        this.business = business;
        this.actualSalary = actualSalary;
        this.maxHoursAccepted = maxHoursAccepted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public double getActualSalary() {
        return actualSalary;
    }

    public void setActualSalary(double actualSalary) {
        this.actualSalary = actualSalary;
    }

    public int getMaxHoursAccepted() {
        return maxHoursAccepted;
    }

    public void setMaxHoursAccepted(int maxHoursAccepted) {
        this.maxHoursAccepted = maxHoursAccepted;
    }

    public boolean isSuitable(Contract contract){
        return contract.isSuitable(this);
    }

    public String toString(){
        return this.getName();
    }
}
