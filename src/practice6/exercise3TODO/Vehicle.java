package practice6.exercise3TODO;

public class Vehicle extends Product{

    private String brand;
    private int kilometer;
    private String patent;
    private VehicleType vehicleType;
    private boolean available;

    public Vehicle(int id, String name, String brand, int kilometer, String patent, VehicleType vehicleType) {
        super(id, name);
        this.brand = brand;
        this.kilometer = kilometer;
        this.patent = patent;
        this.vehicleType = vehicleType;
        this.available = true;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public boolean isAvailable() {
        return this.available;
    }
}
