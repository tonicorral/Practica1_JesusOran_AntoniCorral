package persistence;

import business.Character;
import business.Monster;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JSONMonsterDAO implements MonsterDAO{
    private Gson gson;

    public JSONMonsterDAO(){
        this.gson = new Gson();
    }
    public List <Monster> readAll(){
        try {
            JsonObject object = JsonParser.parseReader(new FileReader("data/Monster.json")).getAsJsonObject();
            Monster[] monsters = gson.fromJson(object.toString(), Monster[].class);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
