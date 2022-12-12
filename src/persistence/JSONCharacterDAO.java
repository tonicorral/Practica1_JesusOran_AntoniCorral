package persistence;

import business.Character;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;


public class JSONCharacterDAO implements CharacterDAO{

    private Gson gson;

    public JSONCharacterDAO() {
        this.gson = new Gson();
    }


    @Override
    public List<Character> readAll() {
        try {
            JsonObject object = JsonParser.parseReader(new FileReader("data/character.json")).getAsJsonObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
