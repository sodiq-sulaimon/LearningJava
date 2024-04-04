import java.util.Scanner;

public class SwitchTest{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int selection;
    System.out.print("Please enter your selection: ");
    selection = input.nextInt();

    String menuOption;

    switch (selection) {
        case 0:
        menuOption = "Operator";
        break;
        case 1:
        menuOption = "Customer Service";
        break;
        case 2:
        menuOption = "Technical Support";
        break;
        case 3:
        menuOption = "Billing";
        break;
        case 4:
        menuOption = "Repeat menu";
        break;
        case 5:
        menuOption = "Hang Up";
        break;
        default:
        menuOption = "Retry selection";
        break;
    }
    System.out.println(menuOption);
    }
}