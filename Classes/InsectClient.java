public class InsectClient{
    public static void main(String[] args){
        System.out.println(Insect.produceRandomFact());
        Insect bug1 = new Insect(5, 20, 35);
        System.out.println(bug1.getWeight());
        System.out.println(Insect.getPopulation());
        bug1.setY(5);
        System.out.println(bug1.getY());

        Insect bug2 = new Insect(2);
        System.out.println(bug2.getWeight());
        System.out.println(bug2.getX());
        System.out.println(bug2.getY());
        System.out.println(Insect.getPopulation());

        System.out.println("bug 1 ---> " + bug1.toString());
        System.out.println("bug 2 ---> " + bug2.toString());

        System.out.println("\nbug 1 ---> " + bug1);
        System.out.println("bug 2 ---> " + bug2);

    }
}