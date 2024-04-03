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
        String cText = "Celsius";
        System.out.printf("%s Fahrenheit: %d\n", day, fahrenheit) ;
//         System.out.println(day + " Celsius: " + celsius);
        System.out.printf("%s %-10s: %.1f\n", day,cText, celsius); //%-11s is used to specify the width of the text. -ve sign means left justified
    }
}