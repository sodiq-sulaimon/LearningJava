import java.util.Scanner;

public class FahrenheitToCelsius{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //read keyboard input
        System.out.print("Enter a Fahrenheit value: ");
        int fahrenheit = input.nextInt();
        input.nextLine(); // cleans up newline at the end of the user input
        System.out.print("Enter your city and the day of the week: ");
        String day = input.nextLine();
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.println(day + " Celsius: " + celsius);
    }
}