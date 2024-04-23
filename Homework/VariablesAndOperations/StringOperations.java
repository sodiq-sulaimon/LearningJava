public class StringOperations{
    public static void main(String[] args){
    String name = "Sodiq";
    System.out.println("Name: " + name);

    String newName1 = name.replace("S", "A");
    String newName2 = newName1.replace("q", "z");
    System.out.println("Modified name: " + newName2);

    String address = "www.gatech.com";
    System.out.println("Address: " + address);

    String addressSplit = address.substring(4, address.length() - 4);

    System.out.println("Password: " + addressSplit.concat("1331"));
    }
}