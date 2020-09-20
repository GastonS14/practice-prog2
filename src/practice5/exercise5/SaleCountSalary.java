package practice5.exercise5;

public class SaleCountSalary extends Salary{

    private FixedSalary fixedSalary;
    private int saleCount;
    private int saleCountAchieved;
    private double rewardSaleCount;

    public SaleCountSalary(FixedSalary fixedSalary, int saleCount, int saleCountAchieved, double rewardSaleCount) {
        this.fixedSalary = fixedSalary;
        this.saleCount = saleCount;
        this.saleCountAchieved = saleCountAchieved;
        this.rewardSaleCount = rewardSaleCount;
    }

    public FixedSalary getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(FixedSalary fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }

    public int getSaleCountAchieved() {
        return saleCountAchieved;
    }

    public void setSaleCountAchieved(int saleCountAchieved) {
        this.saleCountAchieved = saleCountAchieved;
    }

    public double getRewardSaleCount() {
        return rewardSaleCount;
    }

    public void setRewardSaleCount(double rewardSaleCount) {
        this.rewardSaleCount = rewardSaleCount;
    }

    @Override
    public double getSalary() {
        if(saleCountAchieved >= saleCount)
            return fixedSalary.getSalary() + rewardSaleCount;
        else
            return fixedSalary.getSalary();
    }
}
