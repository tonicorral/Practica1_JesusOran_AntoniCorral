package business;

import java.util.ArrayList;
import java.util.List;

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

    public Monster(List<Monster> readAll) {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getEvilType() {
        return evilType;
    }

    public void setEvilType(String evilType) {
        this.evilType = evilType;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(int initialValue) {
        this.initialValue = initialValue;
    }

    public int getEvilDice() {
        return evilDice;
    }

    public void setEvilDice(int evilDice) {
        this.evilDice = evilDice;
    }
}

