public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species = "Rare Pepe";

    public static final int DEFAULT_AGE = 5;
    public static final double DEFAULT_TONGUE_SPEED = 5.0;

    public Frog (String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
    }

    public Frog (String name, double ageInYears, double tongueSpeed) {
        this.name = name;
        this.age = (int) (ageInYears * 12);
        this.tongueSpeed = tongueSpeed;
    }

    public Frog(String name) {
        this(name, DEFAULT_AGE, DEFAULT_TONGUE_SPEED);
    }

    public void grow(int numOfMonths) {
        age += numOfMonths;
        if (age <= 12) {
            tongueSpeed += numOfMonths;
        }
        else if ((age >= 30) && (tongueSpeed >= 5)) {
            tongueSpeed -= (age - 30);
        }

        if ((age > 1 ) && (age < 7)) {
            isFroglet = true;
        }
        else
            isFroglet = false;
    }

    public void grow() {
        age += 1;
        if (age <= 12) {
            tongueSpeed += 1;
        }
        else if ((age >= 30) && (tongueSpeed >= 5)) {
            tongueSpeed -= (age - 30);
        }

        if ((age > 1 ) && (age < 7)) {
            isFroglet = true;
        }
        else
            isFroglet = false;

    }

    public void eat(Fly fly) {
        if (fly.isDead()) {
            return;
        }
        else if ((tongueSpeed > fly.getSpeed()) && (fly.getMass() >= 0.5 * age)) {
            grow();
            fly.setMass(0);
        }
        else
            fly.grow(1);
    }

    public String toString() {
         if (isFroglet) {
            return String.format("My name is %s and I’m a rare froglet! I’m %d months old and my tongue has a speed of %.2f.\n", name, age, tongueSpeed);
         }
         else
            return String.format("My name is %s and I’m a rare frog. I’m %d months old and my tongue has a speed of %.2f.\n", name, age, tongueSpeed);
    }
    public String getSpecies() {
        return species;
    }
    public String setSpecies(String species) {
        return this.species = species;
    }
}