package Child;

import Parent.Vehicle;

public class Truck extends Vehicle{
    private boolean AC;
    private String handBrake;
    private String sound;
    private String engine;
    private boolean container;

    public Truck(String model, String make, int numberOfWheels, int topSpeed) {
        super(model, make, numberOfWheels, topSpeed);
        this.AC = AC;
        this.handBrake = handBrake;
        this.sound = sound;
        this.engine = engine;
        this.container = container;
    }

    public boolean isAC() {
        return AC;
    }
    public void setAC(boolean aC) {
        AC = aC;
    }
    public String getHandBrake() {
        return handBrake;
    }
    public void setHandBrake(String handBrake) {
        this.handBrake = handBrake;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public boolean isContainer() {
        return container;
    }
    public void setContainer(boolean container) {
        this.container = container;
    }

    // public void handBrake(){
    //     System.out.println(this.model + " Pulling handbrake...");
    // }

    // public void openContainer(){
    //     System.out.println(this.model + " Opening container...");
    // }

    // public void accelerate(){
    //     System.out.println(this.model + " Accelerating...");
    // }
}


