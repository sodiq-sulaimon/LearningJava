import java.util.Random;

public class Die{
    public static final int SIDES = 6;
    private int faceValue;
    private Random rand;

    public Die(){
    faceValue = 1; // 1 is just for initialization
    rand = new Random();
    }

    public int roll(){
        faceValue = rand.nextInt(SIDES) + 1; // next int generates number 0 to 5, +1 is needed to have 1 to 6.faceValue
        return faceValue;
    }

    public int getFaceValue(){
        return faceValue;
    }

    public String toString(){
        return "Die with face value: " + faceValue;
    }

    public static void main(String[] args){
        Die die1 = new Die();
        System.out.println(die1);
        System.out.println(die1.roll());
        System.out.println(die1.roll());
    }
}

