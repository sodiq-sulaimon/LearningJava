import java.util.Arrays;

public class Wolf extends Canine implements Groomable, Comparable<Wolf> {
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
        System.out.println("Lick Lick!!");
    }

//     public int compareTo(Object anotherWolf){
//         return -(rank - ((Wolf)anotherWolf).rank); // outside negative sign is needed to negate the result of the comparison
//     }

    public int compareTo(Wolf anotherWolf) { // Comparable<Type> interface allows generic type
        return -(rank - (anotherWolf).rank);
    }

    public String toString(){
        return ("Rank: " + rank + ", Size: " + size + "\n");
    }

    @Override
    public void pay() {
        System.out.println("Grrrr! Warning, don’t try and chase me for payment. I'm a wolf. Run Run Run!");
    }

    public static void main(String[] args){
        Wolf alpha = new Wolf(18.2, 1);
        Wolf sane = new Wolf(19.5, 3);
        System.out.println("Comparison result: " + alpha.compareTo(sane));

        Wolf[] pack = {
                new Wolf(17.1, 2),
                new Wolf (3, 10),
                new Wolf (9.2, 7),
                new Wolf (9.1, 8),
                new Wolf (17.01, 3),
                new Wolf(16.2, 1),
                new Wolf (16, 4),
                new Wolf (16, 5),
                new Wolf (10, 6),
                new Wolf (5, 9)
        };
        System.out.println(Arrays.toString(pack));
        System.out.println("Unsorted Pack: " + Arrays.toString(pack));
        Arrays.sort(pack);
        System.out.println("========================================");
        System.out.println("Sorted Pack: " + Arrays.toString(pack));
    }
}