package practice2.exercise3;

public class Product extends ElementoAbstracto{

    protected double weight;
    protected double cost;
    protected double salePrice;
    protected String woodType;
    protected String woodColor;
    private final double PERCENTAGE_PROFIT = 0.35;

    public Product(double weight, double cost, String woodType, String woodColor){
        this.weight = weight;
        this.cost = cost;
        this.setSalePrice(cost);
        this.woodType = woodType;
        this.woodColor = woodColor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public double getSalePrice() {
        return salePrice;
    }

    private void setSalePrice(double cost) {
        this.salePrice = cost * (1 + PERCENTAGE_PROFIT);
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    public String getWoodColor() {
        return woodColor;
    }

    public void setWoodColor(String woodColor) {
        this.woodColor = woodColor;
    }



}
