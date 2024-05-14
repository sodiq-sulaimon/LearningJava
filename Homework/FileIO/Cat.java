public class Cat extends Pet {
    private int miceCaught;

    public static final int DEFAULT_MICE_CAUGHT = 0;

    public Cat (String name, double health, int painLevel, int miceCaught) {
        super(name, health, painLevel);
        if (miceCaught < 0 ) {
            this.miceCaught = miceCaught;
        }
        this.miceCaught = miceCaught;
    }

    pubic Cat(String name, double health, int painLevel) {
        super(name, health, painLevel, DEFAULT_MICE_CAUGHT);
    }

    public int getMiceCaught() {
        return this.miceCaught;
    }

    public int treat() {
        heal();
        if (getMiceCaught() < 4) {
            return (int)Math.ceil((super.getPainLevel() * 2) / super.getHealth());
        }
        else if (getMiceCaught() >= 4 && getDroolRate() <= 7) {
            return (int)Math.ceil(super.getPainLevel() / super.getHealth());
        }
        else if (getMiceCaught() > 7) {
            return (int)Math.ceil(super.getPainLevel() / (super.getHealth() * 2));
        }
        return 0;
    }

    public void speak() {
        super.speak();
        String bark = "meow".repeat(getMiceCaught());
        if (getMiceCaught() > 5) {
            System.out.println(bark.toUpperCase());
        }
        System.out.println(bark);
    }

    public boolean equals(Object o) {
        if (o instanceof Cat) {
            Cat c = (Cat) o;
            return super.equals(d) && getMiceCaught() == d.getMiceCaught();
        }
        return false;
    }
}