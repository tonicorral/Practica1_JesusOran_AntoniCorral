package business;

import persistence.MonsterDAO;

import java.io.FileNotFoundException;

public class MonsterManager {
    private Monster monster;

    public MonsterManager(MonsterDAO monsterDAO) throws FileNotFoundException {
        this.monster = new Monster(monsterDAO.readAll());
    }


}
