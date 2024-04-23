import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] operations = {"add", "subtract", "multiply", "divide", "alphabetize"};
    System.out.println("List of operations: add subtract multiply divide alphabetize");
    System.out.print("Enter an operation: ");
    String selection = input.next().toLowerCase();

    boolean validSelection = false;
    for (String operation : operations) {
        if (operation.equals(selection)) {
            validSelection = true;
            break;
        }
    }
    if (validSelection){
        switch (selection) {
            case "add":
            System.out.print("Enter two integers: ");
            if (input.hasNextInt() && input.hasNextInt()){ // check if both entries are int
                int add1 = input.nextInt();
                int add2 = input.nextInt();
                System.out.println(add1 + add2);
            }
            else
                System.out.println("Invalid input entered. Terminating...");

            break;

            case "subtract":
            System.out.print("Enter two integers: ");
            if (input.hasNextInt() && input.hasNextInt()){
                int sub1 = input.nextInt();
                int sub2 = input.nextInt();
                System.out.println(sub1 - sub2);
            }
            else
                System.out.println("Invalid input entered. Terminating...");
            break;

            case "multiply":
            System.out.print("Enter two doubles(floats): ");
            if (input.hasNextDouble() && input.hasNextDouble()){
                double mult1 = input.nextDouble();
                double mult2 = input.nextDouble();
                System.out.printf("%.2f\n", mult1 * mult2);
            }
            else
                System.out.println("Invalid input entered. Terminating...");
            break;

            case "divide":
            System.out.print("Enter two doubles(floats): ");
            if (input.hasNextDouble() && input.hasNextDouble()){
                double div1 = input.nextDouble();
                double div2 = input.nextDouble();
                if (div2 != 0){
                    System.out.printf("%.2f\n", div1 / div2);
                }
            }
            else
                System.out.println("Invalid input entered. Terminating...");
            break;

            case "alphabetize":
            System.out.print("Enter two words: ");
            String word1 = input.next();
            String word2 = input.next();
            int result = word1.compareTo(word2);
            if (result == 0){
                System.out.printf("%s and %s are the same.\n", word1, word2);
            }
            else if (result < 0){
                System.out.printf("%s comes before %s alphabetically.\n", word1, word2);
            }
            else
                System.out.printf("%s comes after %s alphabetically.\n", word1, word2);
        }
    }
    else
        System.out.println("Invalid input entered. Terminating...");
    }
}