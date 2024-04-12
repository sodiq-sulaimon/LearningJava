public class ArraySearch {
    public static void main(String args[]) {
        String[] concepts = {"abstraction", "polymorphism", "inheritance", "encapsulation"};

        String result1 = searchStringArray("polymorphism", concepts);
        System.out.println(result1);

        String result2 = searchStringArray("encapsulation", concepts);
        System.out.println(result2);
    }

    public static String searchStringArray(String target, String[] array){
        String result = "not found";
        for (String element : array) {
            if ((element != null) && (element.equals(target))){
                result = "found";
                break;
            }
        }
        return result;
    }
}