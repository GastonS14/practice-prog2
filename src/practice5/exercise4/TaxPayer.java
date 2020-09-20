package practice5.exercise4;

public class TaxPayer {

    private int id;
    private String name;
    private Tax tax;

    public TaxPayer(int id, String name, Tax tax){
        this.id = id;
        this.name = name;
        this.tax = tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public double getValueTax() {
        return tax.getTax();
    }
}
