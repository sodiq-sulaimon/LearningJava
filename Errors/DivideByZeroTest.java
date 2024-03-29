public class DivideByZeroTest{
    public static void main(String[] args){
        int x;
        x = 5/0; // results in semantic error at runtime.
        System.out.println("Done");
        System.out.println("x: " + x);
    }
}