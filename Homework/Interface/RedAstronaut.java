import java.util.Arrays;

public class RedAstronaut extends Player implements Impostor {
    private String skill;

    public static final int DEFAULT_SUSLEVEL = 15;
    public static final String DEFAULT_SKILL = "experienced";

    public RedAstronaut(String name, int susLevel, String skill) {
        super(name, susLevel);
        this.skill = skill.toLowerCase();
    }

    public RedAstronaut(String name) {
        this(name, DEFAULT_SUSLEVEL, DEFAULT_SKILL);
    }

    @Override
    public void emergencyMeeting() {
        if (!super.isFrozen()) {
            Player[] players = super.getPlayers();
            Arrays.sort(players);
            int maxSusLevel = (players[players.length-1]).getSusLevel(); // the last element in the sorted array will have the max SusLevel
            int maxSusLevelCount = 0;

            for (Player player : players) {
                if (!player.isFrozen() && player.getSusLevel() == maxSusLevel) {
                maxSusLevelCount++;
                }
            }
            for (Player player : players) {
                if (!super.getName().equals(player.getName()) && maxSusLevelCount == 1) {
                    player.setFrozen(true);
                }
            }
        }
        super.gameOver();
    }

    @Override
    public void freeze(Player p) {
        if (!isFrozen() || !(p instanceof Impostor) || !p.isFrozen()) {
            if (getSusLevel() < p.getSusLevel()){
                p.setFrozen(true);
            }
            else
                setSusLevel(getSusLevel() * 2);
        }
        super.gameOver();
    }

    @Override
    public void sabotage(Player p) {
        if (!isFrozen() || !(p instanceof Impostor) || !p.isFrozen()) {
            if (getSusLevel() < 20){
                p.setSusLevel((int)(getSusLevel() * 1.5));
            }
            else
                p.setSusLevel((int)(getSusLevel() * 1.25));
        }
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof RedAstronaut){
            RedAstronaut r = (RedAstronaut) o;
        return (getName().equals(r.getName()) && isFrozen() == r.isFrozen()
            && getSusLevel() == r.getSusLevel() && getSkill().equals(r.getSkill()));
        }
        return false;
    }

    @Override
    public String toString(){
        String text = super.toString() + "I am an " + getSkill() + " skill player!";
        if (getSusLevel() > 15) {
            return text.toUpperCase();
        }
        else
            return text;
    }

    public String getSkill() {
        return this.skill;
    }

    public void setSkill(String skill) {
        if (skill == "experienced" || skill == "inexperienced" || skill == "expert") {
            this.skill = skill;
        }
    }

}