import java.util.Scanner;
import java.util.InputMismatchException;

public class FahrenheitToCelsiusExceptions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int fahrenheit = 0;
        boolean success = false;

        while (!success) {
            try {
                System.out.print("Enter a Fahrenheit value: ");
                fahrenheit = input.nextInt();
                success = true;
            } catch (InputMismatchException e){
                System.out.println("Sorry, that wasn't an int");
                System.out.println("Please try again");
            }
            finally {
                input.nextLine();
            }
        }

        double celsius = (5.0/9) * (fahrenheit - 32);
        String cText = "Celsius";
        System.out.printf("Fahrenheit: %d\n", fahrenheit) ;
        System.out.printf("%-10s: %.1f\n", cText, celsius);
    }
}