public class RedAstronaut extends Player implements Impostor {
    private String skill;

    public final int DEFAULT_SUSLEVEL = 15;
    public final String DEFAULT_SKILL = "experienced";

    public RedAstronaut(String name, int susLevel, String skill) {
        super(name, susLevel);
        this.skill = skill.toLowerCase();
    }

    public RedAstronaut(String name) {
        this(name, DEFAULT_SUSLEVEL, DEFAULT_SKILL);
    }

    public void emergencyMeeting() {
        Player p;
        if (p.isFrozen) {
            return;
        }
    }

    public void sabotage(Player p) {

    }

    public boolean equals(Object o) {
        super.equals();
    }
}