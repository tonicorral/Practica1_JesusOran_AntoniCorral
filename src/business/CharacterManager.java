package business;

import persistence.CharacterDAO;

public class CharacterManager {
    private Character character;
    private CharacterDAO characterDAO;
    private Stat stat;
    public CharacterManager (){
        this.character = new Character();
    }


    public void createCharacter(String name) {
        character.setName(name);
    }

    public void createPlayerName(String playerName) {
        character.setPlayerName(playerName);
    }

    public void createIncialLevel(int level) {
        character.setIncialLevel(level);
    }
}
