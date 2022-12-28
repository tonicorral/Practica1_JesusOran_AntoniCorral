package persistence;


import business.Monster;

import java.io.FileNotFoundException;
import java.util.List;

public interface MonsterDAO {
    List <Monster> readAll() throws FileNotFoundException;


}
