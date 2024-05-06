import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleExceptions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a Fahrenheit value: ");
            int fahrenheit = input.nextInt();
            double celsius = (5.0/9) * (fahrenheit - 32);
            String cText = "Celsius";
            System.out.printf("Fahrenheit: %d\n", fahrenheit) ;
            System.out.printf("%-10s: %.1f\n", cText, celsius);
            int x = 1331 / fahrenheit; // added to demonstrate exceptions
        }
        catch (InputMismatchException ime){
            System.out.println("Sorry, that wasn't an int");
            System.out.println("Please re-run the program");
        }
        catch (ArithmeticException ae){
            System.out.println("You entered an invalid number");
            System.out.println(ae.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}