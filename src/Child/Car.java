package Child;

import Parent.Vehicle;

public class Car extends Vehicle{

    private boolean AC;
    private boolean handBrake;
    private String sound;
    private String engine;

    public Car(String model, String make, int numberOfWheels, int topSpeed, boolean AC, boolean handBrake, String sound, String engine) {
        super(model, make, numberOfWheels, topSpeed);
        this.AC = AC;
        this.handBrake = handBrake;
        this.sound = sound;
        this.engine = engine;
    }

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean aC) {
        AC = aC;
    }

    public boolean getHandBrake() {
        return handBrake;
    }

    public void setHandBrake(boolean handBrake) {
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

    @Override
    public void handBrake(){
        if(handBrake == false)
        {
            System.out.println(this.getModel() + " Not Pulling handbrake...");
        }
        else
        {
            System.out.println(this.getModel() + " Pulling handbrake...");
        }
        
    }

    @Override
    public void Break(){
        if(handBrake == false)
        {
            System.out.println(this.getModel() + " braking...");
        }
        else
        {
            System.out.println(this.getModel() + " Not breaking...");
        }
        
    }
    
    @Override
    public void openContainer(){
        System.out.println(this.getModel() + " Opens Trunk");
    }
}
