package business;

public class Monster {
    private String name;
    private String difficulty;
    private String evilType;
    private int experience;
    private int life;
    private int initialValue;
    private int evilDice;

    public Monster(String name, String difficulty, String evilType, int experience, int life, int initialValue, int evilDice) {
        this.name = name;
        this.difficulty = difficulty;
        this.evilType = evilType;
        this.experience = experience;
        this.life = life;
        this.initialValue = initialValue;
        this.evilDice = evilDice;
    }
}
