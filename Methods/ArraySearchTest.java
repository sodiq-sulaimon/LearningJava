public class ArraySearchTest {
    public static void main(String args[]) {
    String[] names = {"Jessica", "Adam", "Mike", "Janet", "James"};
    int[] evenNums= {2, 4, 6, 8, 10};

    System.out.println(ArraySearch.searchStringArray("Jessica", names));
    System.out.println(ArraySearch.searchStringArray("Sodiq", names));

    System.out.println(OverloadedMethod.searchArray("Ayo", names));
    System.out.println(OverloadedMethod.searchArray(1, evenNums));
    System.out.println(OverloadedMethod.searchArray(8, evenNums));
    }
}