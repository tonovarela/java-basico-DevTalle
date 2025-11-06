package proyecto3;

public class Proyecto3Imp {

    static void main() {

        Vehicle myCar = new Car("Toyota", "Corolla", 2020,CarType.SEDAN);
        myCar.startEngine();
        System.out.println(myCar.toString());

        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model 3", 2021,CarType.SEDAN,75);
        myElectricCar.startEngine();
        myElectricCar.chargeBattery();
        System.out.println(myElectricCar.toString());




    }
}
