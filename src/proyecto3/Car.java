package proyecto3;

public class Car extends  Vehicle {

    private  CarType type;

    public Car(String brand, String model, int year,CarType type) {
        super(brand, model, year);
        this.type = type;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public String toString() {
        return super.toString() + ", Type: " + type;
    }



}

