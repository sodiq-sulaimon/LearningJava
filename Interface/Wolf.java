public class Wolf extends Canine{
    protected int rank;

    public Wolf(double size, int rank){
        super(size);
        this.rank = rank;
    }

    public void bark(){
        for (int i=0; i<3; i++){
            super.bark();
        }
    }

    public final int getRank(){ // methods with 'final' cannot be overwritten
        return rank;
    }

    public void groom(){
        System.out.println("Rinse Rinse!!");
    };

    public static void main(String[] args){
        Wolf alpha = new Wolf(18.2, 1);
        alpha.bark();
    }
}