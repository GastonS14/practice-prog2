package practice2.exercise3;

public class DiscountedProduct extends Product{

    private final double DISCOUNTED_PRICE = 0.1;

    public DiscountedProduct(double weight, double cost, String woodType, String woodColor) {
        super(weight, cost, woodType, woodColor);
        this.setSalePrice(cost);
    }

    private void setSalePrice(double cost){
       this.salePrice = cost * (1 + DISCOUNTED_PRICE);
    }
}
