package practice6.exercise3TODO;

import java.time.LocalDate;
import java.util.Hashtable;
import java.util.Vector;

public class Rental {

    public final static int LOAN_DAYS = 15;
    private Vector<Product> product;
    private LocalDate topDateToReturn;
    private Hashtable<Integer, Client> rentedProductsPerClient;

    public Rental() {
        this.topDateToReturn = LocalDate.now();
        rentedProductsPerClient = new Hashtable<>();
    }

    public LocalDate getTopDateToReturn() {
        return topDateToReturn;
    }

    public void setTopDateToReturn(LocalDate topDateToReturn) {
        this.topDateToReturn = topDateToReturn;
    }

    public Vector<Client> getOverdueRentals(){
        return null;
    }

    private void addRentedProductsPerClient(Integer productId, Client c){
        rentedProductsPerClient.put(productId, c);
    }

    private void removeRentedProductsPerClient(Integer productId){
        rentedProductsPerClient.remove(productId);
    }

    public void rent(Client client, Product p){
        if(p.isAvailable()){
            product.remove(p);
            client.addRentedProduct(p);
            updateDateToReturn();
            this.addRentedProductsPerClient(p.getId(), client);
        }
    }

    //INCOMPLETE
    public void returnProduct(Integer productId){
        this.removeRentedProductsPerClient(productId);
    }

    public void updateDateToReturn(){
        LocalDate a = LocalDate.now();
        int year = a.getYear();
        int month =  a.getMonthValue();
        int day = a.getDayOfMonth() + LOAN_DAYS;
        topDateToReturn = LocalDate.of(year, month, day);
    }
}
