package practice6.exercise3TODO;

import java.util.Vector;

public class Client {

    private int dni;
    private String name;
    private Vector<Product> rentedProducts;

    public Client(int dni, String name) {
        this.dni = dni;
        this.name = name;
        rentedProducts = new Vector<>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRentedProduct(Product product){
        rentedProducts.add(product);
    }

    public void removeRentedProduct(Product product){
        rentedProducts.remove(product);
    }
}
