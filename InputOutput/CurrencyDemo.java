import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class CurrencyDemo{
    public static void main(String[] args){
        int items;
        double itemCost, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        items = input.nextInt();
        System.out.print("Enter the cost per item: ");
        itemCost = input.nextDouble();
        total = items * itemCost;
        System.out.println();
        System.out.println("Unformatted total: " + total);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.KOREA);
        System.out.println("Formatted total: " + currencyFormat.format(total));
    }
}