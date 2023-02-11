import Child.bike;
import Child.Car;
import Child.Cycle;
import Child.Truck;

public class App {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("Matrix", "Nissan", 4, 50, true, false, "Quiet", "On");
        car1.accelerate();
        car1.Break();
        car1.handBrake();
        car1.openContainer();
        System.out.println();

        bike bike1 = new bike("Sportster" , "Tamiya", 2, 100, "On");
        bike1.accelerate();
        bike1.Break();
        bike1.handBrake();
        bike1.openContainer();
        System.out.println();

        Cycle cycle1 = new Cycle("BMX", "Thoma", 2);
        cycle1.Break();
        cycle1.accelerate();
        cycle1.handBrake();
        cycle1.openContainer();
        System.out.println();

        Truck truck1 = new Truck("Jeep", "Cherokee", 4, 10);
        truck1.accelerate();
        truck1.Break();
        truck1.handBrake();
        truck1.openContainer();
        System.out.println();
    }
}
