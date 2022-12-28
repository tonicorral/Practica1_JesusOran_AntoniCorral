package business;

public class Character {
    private String name;
    private String playerName;
    private String classType;
    private Stat[] stats;
    private int incialLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public Stat[] getStats() {
        return stats;
    }

    public void setStats(Stat[] stats) {
        this.stats = stats;
    }

    public int getIncialLevel() {
        return incialLevel;
    }

    public void setIncialLevel(int incialLevel) {
        this.incialLevel = incialLevel;
    }
}
