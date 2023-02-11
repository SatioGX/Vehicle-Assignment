package Child;

import Parent.Vehicle;

import Parent.Vehicle;

public class bike extends Vehicle{
    private String engine;

    public bike(String model, String make, int numberOfWheels, int topSpeed, String engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void openContainer(){
        System.out.println(this.getModel() + " Opens compartment");
    }

    @Override
    public void handBrake(){
        System.out.println(this.getModel() + " has no hand-break");
    }
}


