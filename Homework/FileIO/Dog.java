public class Dog extends Pet {
    private double droolRate;

    public static final double DEFAULT_DROOL_RATE = 5.0;

    public Dog (String name, double health, int painLevel, double droolRate) {
        super(name, health, painLevel);
        this.droolRate = droolRate;
    }

    public Dog (String name, double health, int painLevel) {
        this(name, health, painLevel, DEFAULT_DROOL_RATE);
    }

    public double getDroolRate() {
        return this.droolRate;
    }

    public int treat() {
        heal();
        if (getDroolRate() < 3.5) {
            return (int)Math.ceil((super.getPainLevel() * 2) / super.getHealth());
        }
        else if (getDroolRate() >= 3.5 && getDroolRate() <= 7.5) {
            return (int)Math.ceil(super.getPainLevel() / super.getHealth());
        }
        else if (getDroolRate() > 7.5) {
            return (int)Math.ceil(super.getPainLevel() / (super.getHealth() * 2));
        }
        return 0;
    }

    public void speak() {
        super.speak();
        String bark = "bark".repeat(getPainLevel());
        if (getPainLevel() > 5) {
            System.out.println(bark.toUpperCase());
        }
        System.out.println(bark);
    }

    public boolean equals(Object o) {
        if (o instanceof Dog) {
            Dog d = (Dog) o;
            return super.equals(d) && getDroolRate() == d.getDroolRate();
        }
        return false;
    }
}