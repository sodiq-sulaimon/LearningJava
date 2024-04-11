public class Averager{
    public static void main(String[] args){
    double sum = 0;
    for (String arg : args){
        sum += Double.parseDouble(arg);
    }
    double avg = (args.length > 0) ? (sum/args.length) : 0;
    System.out.println("Average: " + avg);
    }
}