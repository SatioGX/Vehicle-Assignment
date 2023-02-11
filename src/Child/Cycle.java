package Child;

import Parent.Vehicle;

public class Cycle extends Vehicle{

    public Cycle(String model, String make, int numberOfWheels) {
        super(model, make, numberOfWheels, 0);
    }
    
    @Override
    public void handBrake(){
        System.out.println(this.getMake() + " " + this.getModel() + " Has no hand-break");
    }

    @Override
    public void openContainer(){
        System.out.println(this.getModel() + " has no container");
    }
}
