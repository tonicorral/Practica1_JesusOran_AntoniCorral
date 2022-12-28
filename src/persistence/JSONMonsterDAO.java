package persistence;

import business.Monster;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONMonsterDAO implements MonsterDAO {
    private Gson gson;

    public JSONMonsterDAO() {
        this.gson = new Gson();
    }
    public List <Monster> readAll() throws FileNotFoundException {

        JsonObject object = JsonParser.parseReader(new FileReader("data/monsters.json")).getAsJsonObject();
        Monster[] monsters = gson.fromJson(object, Monster[].class);

        return List.of(monsters);

    }
}



