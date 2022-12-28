package business;

import persistence.AdventureDAO;

public class AdventureManager {
    private  Adventure adventure;
    private AdventureDAO adventureDAO;

    public AdventureManager(AdventureDAO adventureDAO) {
        this.adventureDAO = adventureDAO;
        this.adventure = new Adventure();
    }
/**
    public Combat createCombat(){

    }

    public Monster addMonster(){

    }

    public Monster removeMonster(){

    }
 **/
}

