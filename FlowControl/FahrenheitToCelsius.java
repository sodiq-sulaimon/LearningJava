import java.util.Scanner;
public class FahrenheitToCelsius{
    public static void main(String[] args){
    final int MIN_PARK_TEMP = 70;
    final int MAX_PARK_TEMP = 90;

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a fahrenheit value: ");
    int fahrenheit = input.nextInt();
    System.out.print("Enter the day of the week: ");
    String day = input.next();
    double celsius = (5.0/9) * (fahrenheit - 32);

    System.out.printf("%s temperature is %.1f in Celsius.\n", day, celsius);
    if (fahrenheit >= MIN_PARK_TEMP && fahrenheit <= MAX_PARK_TEMP){
        boolean raining = false;
        System.out.print("Is it raining? (y/n): ");
        String rainInput = input.next().toLowerCase();
        raining = rainInput.startsWith("y") ? true : false; // ternary conditional operator
        if (raining)
            System.out.println("Look up fun things to do in the rain.");
        else
            System.out.println("Yay! Time to go to the park");
        }
    else
        System.out.println("Stay home and learn CS 1331.");
    }
}