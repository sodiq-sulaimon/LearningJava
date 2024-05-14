public abstract class Pet {
    private String name;
    private double health;
    private int painLevel;

    public Pet(String name, double health, int painLevel) {
        if (health > 1.0) {
            this.health = 1.0;
        }
        else if (health < 0.0) {
            this.health = 0.0;
        }
        else
            this.health = health;

        if (painLevel > 10) {
            this.painLevel = 10;
        }
        else if (painLevel < 1) {
            this.painLevel = 1;
        }
        else
            this.painLevel = painLevel;
    }

    public String getName() {
        return this.name;
    }

    public double getHealth() {
        return this.health;
    }

    public int getPainLevel() {
        return this.painLevel;
    }

    public abstract int treat();

    public void speak() {
        String text = "Hello! My name is" + getName();
        if (getPainLevel() > 5) {
            System.out.println(text.toUpperCase());
        }
        System.out.println(text);
    }

    public boolean equals (Object o) {
        if (o instanceof Pet) {
            Pet p = (Pet) o;
            return getName().equals(p.getName());
        }
        return false;
    }

    protected void heal() {
        this.health = 1.0;
        this.painLevel = 1;
    }
}