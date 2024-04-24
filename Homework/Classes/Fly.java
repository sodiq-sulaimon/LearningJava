public class Fly{

    // instance variables
    private double mass;
    private double speed;

    // static constants
    public static final double DEFAULT_MASS = 5.0;
    public static final double DEFAULT_SPEED = 10.0;

    // constructors
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    public Fly(double mass){
        this(mass, DEFAULT_SPEED);
    }

    public Fly(){
        this(DEFAULT_MASS, DEFAULT_SPEED);
    }

    // methods()
    public double getMass() {
        return mass;
    }

    public double getSpeed() {
        return speed;
    }

    public void setMass(double newMass) {
        if (newMass >= 0){
            this.mass = newMass;
        }
    }

    public void setSpeed(double newSpeed) {
        if (newSpeed >= 0) {
            this.speed = newSpeed;
        }
    }

    public String toString() {
        if (mass == 0) {
            return String.format("I’m dead, but I used to be a fly with a speed of %.2f.", speed);
        }
        else
            return String.format("I’m a speedy fly with %.2f speed and %.2f mass.", speed, mass);
    }

    public void grow(int addedMass) {
        mass = mass + addedMass;
        if (mass < 20) {
            speed = speed +  addedMass;
        }
        else if (mass >= 20){
            speed = speed - (0.5 * (mass - 20));
        }
    }

    public boolean isDead(){
        if (mass == 0){
            return true;
        }
        else
            return false;
    }
}