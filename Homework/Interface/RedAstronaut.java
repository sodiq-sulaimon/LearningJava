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
                if (!getName().equals(player.getName()) && maxSusLevelCount == 1) {
                    player.setFrozen(true);
                }
                else
                    return;
            }
        }
        super.gameOver();
    }

    public void sabotage(Player p) {
        return;
    }

    public void freeze(Player p) {
        return;
    }

    public boolean equals(Object o) {
        return false;
    }
}