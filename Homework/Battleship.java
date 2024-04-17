import java.util.Scanner;

public class Battleship{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int[][] playerOneShips = new int[5][2];
    int[][] playerTwoShips = new int[5][2];
    int numPlayers = 2;
    String[]  playerTags = {"PLAYER 1", "PLAYER 2"};

    System.out.println("Welcome to Battleship!");

    for (String player : playerTags){
        System.out.printf("%s, ENTER YOUR SHIPS' COORDINATES.\n", player);
        int shipNumber = 5;
        int count = 1;
        while (count <= shipNumber){
            System.out.printf("Enter ship %d location: ", count);
            if (!input.hasNextInt() || !input.hasNextInt()) { // either input is not int
                System.out.println("Invalid coordinates. Choose different coordinates.");
                break;
                }
            else if (player.equals(playerTags[0])){
                playerOneShips[count-1][0] = input.nextInt();
                playerOneShips[count-1][0] = input.nextInt();
                }
            else if (player.equals(playerTags[1])) {
                playerTwoShips[count-1][0] = input.nextInt();
                playerTwoShips[count-1][0] = input.nextInt();
            }
            count++;
        }
    }
    }
}