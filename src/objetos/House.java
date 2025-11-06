package objetos;

public class House {

    int doors ;
    int windows ;
    double size ;

    public House() {
   this.windows=0;
    this.size=0.0;
    this.doors=0;
    }

    public House(int windows, double size, int doors) {
        this.windows = windows;
        this.size = size;
        this.doors = doors;
    }

    void openDoor() {
        System.out.println("The door is now open.");
    }

    double calculateArea() {
        return size* size;
    }

}
