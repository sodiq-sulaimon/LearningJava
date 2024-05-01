import java.util.Arrays;

public class BlueAstronaut extends Player implements Crewmate {
    private int numTasks;
    private int taskSpeed;

    public final static int DEFAULT_SUSLEVEL = 15;
    public final static int DEFAULT_NUMTASKS = 6;
    public final static int DEFAULT_TASKSPEED = 10;

    public BlueAstronaut(String name, int susLevel, int numTasks, int taskSpeed) {
        super(name, susLevel);
        this.numTasks = numTasks;
        this.taskSpeed = taskSpeed;
    }

    public BlueAstronaut(String name) {
        this(name, DEFAULT_SUSLEVEL, DEFAULT_NUMTASKS, DEFAULT_TASKSPEED);
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
    public void completeTask(){
        if (!super.isFrozen()) {
            if (getTaskSpeed() > 20) {
                setNumTasks(getNumTasks() - 2);
            }
            else
                setNumTasks(getNumTasks() - 1);
        }
        if (getNumTasks() < 0) {
            setNumTasks(0);
        }
        if (getNumTasks() == 0) {
            System.out.println("I have completed all my tasks");
            super.setSusLevel((int)(getSusLevel() * 0.5));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BlueAstronaut) {
            BlueAstronaut b = (BlueAstronaut) o;
            return (getName().equals(b.getName()) && isFrozen() == b.isFrozen()
            && getSusLevel() == b.getSusLevel() && getTaskSpeed() == (b.getTaskSpeed()));
        }
        return false;
    }

    @Override
    public String toString(){
        String text = super.toString() + "I have " + getNumTasks() + " left over.";
        if (getSusLevel() > 15) {
            return text.toUpperCase();
        }
        else
            return text;
    }

    public int getTaskSpeed() {
        return this.taskSpeed;
    }

    public int getNumTasks() {
        return this.numTasks;
    }

    public void setNumTasks(int numTasks) {
        this.numTasks = numTasks;
    }

    public void setTaskSpeed(int taskSpeed) {
        if (taskSpeed >=0) {
            this.numTasks = numTasks;
        }
    }
}