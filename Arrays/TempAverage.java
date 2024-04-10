import java.util.Scanner;

public class TempAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] weekHighs = new double[7];
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String day;
        int i = 0;
        while (i < weekDays.length){
            day = weekDays[i];
            System.out.printf("Enter high temperature for %s: ", day);
            weekHighs[i] = input.nextDouble();
            i++;
            }
        double highsSum = 0;
        for (i = 0; i < weekHighs.length; i++){
            highsSum += weekHighs[i];
        }
        double highsAvg = highsSum / weekHighs.length;
        System.out.printf("Average high temperature for the week: %.1f\n ", highsAvg);
    }
}