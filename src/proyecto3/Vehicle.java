package proyecto3;

public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;

    public abstract  void startEngine();

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year;
    }





}
