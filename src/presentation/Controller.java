package presentation;
import business.*;

import java.lang.Math;

public class Controller {
    private Menu menu;
    private CharacterManager cm;
    private CombatManager ctm;
    private MonsterManager mm;
    private AdventureManager am;

    public Controller(Menu menu, CharacterManager cm) {
        this.menu = menu;
        this.cm = cm;
    }

    public void run() {
        int option;
        boolean stop;
        menu.showWelcome();
        if (true) {
            menu.showMessage("Data was successfully loaded.\n");

            do {
                menu.showMenu();
                menu.showMessage("Your answer: ");
                option = menu.askForAnOption(5, 1);
                menu.showMessage("\n");
                stop = optionRun(option);

            } while (stop);


        } else {
            menu.showMessage("Error loading");
        }
    }


    private boolean optionRun(int option){
        switch (option){
            case 1:
                return characterCreation();
            case 2:
                return listCharacters();
            case 3:
                return createAdventure();
            case 4:
                return startAdventure();
            case 5:
                menu.showMessage("Tavern keeper: “Are you leaving already? See you soon, adventurer.”\n");
                return false;
            default:
                menu.showMessage("Try another number\n\n");
                return true;

        }
    }

    private boolean characterCreation(){
        String name;
        String playerName;
        int level;
        menu.showMessage("Tavern keeper: “Oh, so you are new to this land.”\n");
        menu.showMessage("“What’s your name?”\n\n");

        menu.showMessage("-> Enter your name: ");
        name = menu.askForString();
        cm.createCharacter(name);
        menu.showMessage("Tavern keeper: “Hello,"+ name +", be welcome.\n");
        menu.showMessage("“And now, if I may break the fourth wall, who is your Player?”\n\n");

        menu.showMessage("-> Enter the player’s name: ");
        playerName = menu.askForString();
        cm.createPlayerName(playerName);
        menu.showMessage(playerName);

        menu.showMessage("\nTavern keeper: “I see, I see...”");
        menu.showMessage("\n“Now, are you an experienced adventurer?”\n");
        menu.showMessage("\n-> Enter the character’s level [1..10]: ");
        level = menu.askForAnOption(10, 1);
        cm.createIncialLevel(level);
        menu.showMessage("\nTavern keeper: “Oh, so you are level "+level+"!”");
        menu.showMessage("\n“Great, let me get a closer look at you...”\n");
        menu.showMessage("\nGenerating your stats...\n\n");



        return true;
    }

    private boolean listCharacters(){
        menu.showMessage("2");
        menu.showMessage("\nTavern keeper: “Lads! They want to see you!”");
        menu.showMessage("“Who piques your interest?”\n");
        menu.showMessage("\n-> Enter the name of the Player to filter: ");
        String playerName=menu.askForString();
        menu.showMessage("\nYou watch as some adventurers get up from their chairs and approach you.\n");

        //aqui printaremos los que tengan el nombre del jugador igual
        //while(){
        //}
        menu.showMessage("\n0. Back\n");
        menu.showMessage("Who would you like to meet [0..5]: ");
        int character=menu.askForInt();
        menu.showMessage("");

        menu.showMessage("Name: ");
        menu.showMessage("Player: ");
        menu.showMessage("Class: ");
        menu.showMessage("Level: ");
        menu.showMessage("XP: ");
        menu.showMessage("Body: ");
        menu.showMessage("Mind: ");
        menu.showMessage("Spirit: ");

        menu.showMessage("[Enter name to delete, or press enter to cancel]");
      //  menu.showMessage("Do you want to delete "++"?");

        menu.showMessage("Tavern keeper: “I’m sorry kiddo, but you have to leave.”");

        //menu.showMessage("Character "++" left the Guild.");
        return true;
    }


    private boolean createAdventure(){
        System.out.println("3");
        return true;
    }

    private boolean startAdventure(){
        System.out.println("4");
        return true;

    }
}

