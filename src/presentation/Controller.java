package presentation;

public class Controller {
    private Menu menu;

    public Controller(Menu menu){
        this.menu=menu;
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
                option = menu.askForInt();
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
        menu.showMessage("Tavern keeper: “Oh, so you are new to this land.”\n");
        menu.showMessage("“What’s your name?”\n\n");
        menu.showMessage("-> Enter your name:");
        name = menu.askForString();
        menu.showMessage("Tavern keeper: “Hello,"+ name +", be welcome.”\n");
        menu.showMessage("“And now, if I may break the fourth wall, who is your Player?”\n\n");
        menu.showMessage("-> Enter the player’s name:");
        playerName = menu.askForString();
        menu.showMessage(playerName);
        return true;
    }

    private boolean listCharacters(){
        System.out.println("2");
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

