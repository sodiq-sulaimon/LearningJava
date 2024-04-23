public class Dog extends Canine{
    protected String name;

    public Dog(String name, double size){
        super(size);
        this.size = size;
    }

    public void fetch(){
        System.out.println("Run");
        System.out.println("Clinch");
        System.out.println("Fetch");
    }

    public void groom(){};

    public boolean equals(Object obj){
        if (!(obj instanceof Dog)) {
            return false;
        }
        Dog doggy = (Dog) obj;
        return ((doggy.size == size) && (doggy.name.equals(name)));
    }

    public static void main(String[] args){
        Dog spot1 = new Dog("Spot", 5.90001);
        Dog spot2 = new Dog("Spot", 5.9);
        spot1.bark();
        spot2.bark();

        System.out.println(spot1.equals(spot2));
    }
}