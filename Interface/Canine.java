public abstract class Canine implements Groomable {
    protected double size=1.0;

    public Canine(double size) {
        this.size = size;
    }

    public void bark(){
        System.out.println("Woof Woof");
    }

//     public abstract void groom();
}