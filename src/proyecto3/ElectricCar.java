package proyecto3;

public class ElectricCar extends  Vehicle implements  IElectric{

    private int batteryCapacity;
    private  CarType carType;

    public ElectricCar(String brand, String model, int year,CarType carType, int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
        this.carType = carType;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric car engine started silently.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + carType + ", Battery Capacity: " + batteryCapacity + " kWh";
    }

    @Override
    public void chargeBattery() {
        batteryCapacity=100;
        System.out.println("Charging the electric car's battery.");
    }
}
