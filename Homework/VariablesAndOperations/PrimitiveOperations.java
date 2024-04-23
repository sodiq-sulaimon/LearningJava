public class PrimitiveOperations{
    public static void main(String[] args){
        int x = 4;
        double y = 20.0;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        double product = x * y;
        System.out.println("Product of x & y: " + product);

        double new_x = (double) x;
        System.out.println("New x: " + new_x);

        int new_y = (int) y;
        System.out.println("y: " + new_y);

        char letter = 'K';
        System.out.println("Letter: " + letter);

        int letterLower = (int)Character.toLowerCase(letter);
        System.out.println("Letter's lowercase unicode value: " + letterLower);
    }
}