public class GroomEverything {
    public static void main(String[] args) {
        // list of groomable objects
        Groomable[] groomer = {
            new Wolf(17.01, 3),
            new Dog("richie", 12.5),
            new Car("Yuhina", "spark", 2024)
        };
        for (Groomable g : groomer) { //groom everything
            System.out.println("Tip: " + Groomable.calculateTip(34.99, 20));
            g.groom();
            g.pay();
        }
    }
}