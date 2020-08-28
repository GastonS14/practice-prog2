package practice3.exercise2;

public class Appliance {

    private static final int LIMIT_ENERGY_CONSUMPTION = 45;
    private static final int LIMIT_HIGH_END = 3;

    private String name;
    private double basePrice;
    private String color;
    private double energyConsumption;
    private double weight;

    public Appliance(String name){
        this.name = name;
        this.basePrice = 100;
        this.color = "gris plata";
        this.energyConsumption = 10;
        this.weight = 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isLowEnergyConsumption(){
        return this.getEnergyConsumption() < LIMIT_ENERGY_CONSUMPTION;
    }

    public double getBalance(){
        return this.getBasePrice()/this.getWeight();
    }

    public boolean isHighEnd(){
        return this.getBalance() > LIMIT_HIGH_END;
    }
}
