public class IndexOfTest {
    public static void main(String[] args) {
        String funnyStr = "Computer!Science,!long!walks!on!the!beach";
        int a = funnyStr.indexOf(33); // 33 is the unicode value of !
        int b = funnyStr.indexOf('!'); //chars are converted to Unicode int value
        int c = funnyStr.indexOf("!");
        int d = funnyStr.indexOf("!Science");
        int e = funnyStr.indexOf("!Science,!long");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}