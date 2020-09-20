package practice5.exercise4;

public class Tax {

    private String name;
    protected double tax;

    public Tax(String name, double tax){
        this.name = name;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax(){
        return this.tax;
    }

    private void setTax(double tax){
        this.tax = tax;
    }
}
