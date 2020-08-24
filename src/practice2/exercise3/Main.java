package practice2.exercise3;

public class Main {

    public static void main(String[] args) {

        Factory ff = new Factory();

        Product a = new Product(20.00, 40, "good", "green");
        Product b = new Product(50.00, 80, "bad", "pink");
        Product c = new Product(20.00, 20, "bad bunny", "black&white");
        Product d = new Product(20.00, 150, "goodyear", "black");

        ff.addProduct(a);
        ff.addProduct(b);
        ff.addProduct(c);
        ff.addProduct(d);

    }

}
