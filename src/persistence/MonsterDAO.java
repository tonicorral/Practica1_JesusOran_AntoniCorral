package persistence;

import business.Character;
import business.Monster;

import java.util.List;

public interface MonsterDAO {
    List<Monster> readAll();
}
