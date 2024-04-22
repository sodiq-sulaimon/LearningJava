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
    public static void main(String[] args){
        Dog spot = new Dog("Spot", 5.8);
        spot.bark();
    }
}