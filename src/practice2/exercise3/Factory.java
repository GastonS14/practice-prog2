package practice2.exercise3;

import java.util.Vector;

public class Factory extends ElementoAbstracto{

    private Vector<Product> stock;

    public Factory(){
        stock = new Vector<>();
    }

    @Override
    public double getCost() {
        double cost = 0;
        for (Product product: stock){
            cost += product.getCost();
        }
        return cost;
    }

    @Override
    public double getSalePrice() {
        double salePrice = 0;
        for (Product product: stock){
            salePrice += product.getSalePrice();
        }
        return salePrice;
    }

    public void addProduct(Product e){
        stock.add(e);
    }

    public void deleteProduct(Product e){
        stock.remove(e);
    }
}
