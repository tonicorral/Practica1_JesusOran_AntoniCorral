package presentation;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void showWelcome(){
        System.out.println("Welcome to Simple LSRPG.\n");
        System.out.println("Loading data...");
    }
    public void showMenu(){
        System.out.println("The tavern keeper looks at you and says:");
        System.out.println("“Welcome adventurer! How can I help you?”\n");
        System.out.println("1) Character creation");
        System.out.println("2) List characters");
        System.out.println("3) Create an adventure");
        System.out.println("4) Start an adventure");
        System.out.println("5) Exit");
    }

    public void showLoaded(){
        System.out.println("Data was successfully loaded.");
    }

    public void showNotLoadedMonsters(){
        System.out.println("Error: The monsters.json file can’t be accessed.");
    }
    public void showNotLoadedCharacters(){
        System.out.println("Error: The characters.json file can’t be accessed.");
    }
    public void showNotLoadedAdventure(){
        System.out.println("Error: The adventure.json file can’t be accessed.");
    }

    public int askForOption (){
        int number;
        System.out.print("Your answer: ");
        number = scanner.nextInt();
        System.out.println();
        return number;
    }
    public void errorMessage(){
        System.out.println("Try another number");
    }

    public void exitMessage(){
        System.out.println("Tavern keeper: “Are you leaving already? See you soon, adventurer.”");
    }
    public void showMessageError(String message){
        System.out.println(message);
    }

}
