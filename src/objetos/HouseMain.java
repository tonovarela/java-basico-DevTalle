package objetos;

public class HouseMain {

    static void main() {
        House myHouse = new House();
        IO.println("My house has " + myHouse.doors + " doors.");
        IO.println("My house has " + myHouse.windows + " windows.");
        IO.println("My house size is " + myHouse.size + " square meters.");

        House neighborHouse = new House(4, 85.0, 2);

        IO.println("Neighbor's house has " + neighborHouse.doors + " doors.");
        IO.println("Neighbor's house has " + neighborHouse.windows + " windows.");
        IO.println("Neighbor's house size is " + neighborHouse.size + " square meters.");
    }
}
