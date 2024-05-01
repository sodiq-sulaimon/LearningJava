public class Gameplay {
    public static void main(String[] args){
        BlueAstronaut bob = new BlueAstronaut("Bob", 24, 6, 30);
        BlueAstronaut heath = new BlueAstronaut("Heath", 30, 3, 21);
        BlueAstronaut albert = new BlueAstronaut("Albert", 44, 2, 0);
        BlueAstronaut angel = new BlueAstronaut("Angel", 0, 1, 0);

        RedAstronaut liam = new RedAstronaut("Liam", 19, "experienced");
        RedAstronaut suspicious = new RedAstronaut("Suspicious Person", 100, "expert");

        liam.sabotage(bob);
        System.out.println("Bob suslevel: " + bob.getSusLevel());
        System.out.println("Bob Frozen?: " + bob.isFrozen());

        liam.sabotage(suspicious);
        System.out.println("Suspicious suslevel: " + suspicious.getSusLevel());
        System.out.println("Suspicious Frozen?: " + suspicious.isFrozen());

        liam.freeze(albert);
        System.out.println("Liam suslevel: " + liam.getSusLevel());
        System.out.println("Albert Frozen?: " + albert.isFrozen());

        albert.emergencyMeeting();

        suspicious.emergencyMeeting();

        heath.completeTask();
        System.out.println("Heath numTask: " + heath.getNumTasks());
        System.out.println("Heath Frozen?: " + heath.isFrozen());

        heath.completeTask();
        System.out.println("Heath numTask: " + heath.getNumTasks());

        heath.completeTask();
        System.out.println("Heath numTask: " + heath.getNumTasks());

        liam.freeze(angel);
        System.out.println("Liam suslevel: " + liam.getSusLevel());
        System.out.println("Angel Frozen?: " + angel.isFrozen());

        liam.sabotage(bob);
        System.out.println("bob suslevel: " + bob.getSusLevel());
        liam.sabotage(bob);
        System.out.println("bob suslevel: " + bob.getSusLevel());

        liam.freeze(bob);
        System.out.println("Bob Frozen?: " + bob.isFrozen());

        angel.emergencyMeeting();
        System.out.println("Liam Frozen?: " + liam.isFrozen());

    }
}