package practice5.exercise4;

public class SpecificTax extends Tax{

    private double sale;
    private double fixedPercentage;
    private double salePercentage;

    public SpecificTax(String name, double tax, double sale, double fixedPercentage, double salePercentage) {
        super(name, tax);
        this.sale = sale;
        this.fixedPercentage = fixedPercentage;
        this.salePercentage = salePercentage;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getFixedPercentage() {
        return fixedPercentage;
    }

    public void setFixedPercentage(double fixedPercentage) {
        this.fixedPercentage = fixedPercentage;
    }

    public double getSalePercentage() {
        return salePercentage;
    }

    public void setSalePercentage(double salePercentage) {
        this.salePercentage = salePercentage;
    }

    @Override
    public double getTax(){
        return super.getTax() * fixedPercentage + sale * salePercentage;
    }

}
