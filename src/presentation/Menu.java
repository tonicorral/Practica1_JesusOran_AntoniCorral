package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private String message;

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
        System.out.println("5) Exit\n");
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

    public int askForInt (){
        return scanner.nextInt();
    }

    public void showMessage(String message){
            System.out.print(message);
    }

    public String askForString(){

        return scanner.nextLine();
    }
    public int askForAnOption(int max, int min) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                int option = Integer.parseInt(scanner.nextLine());
                if (option < min || option > max) {
                    System.out.println("\nPlease input a number between " + min + " and " + max + "\n");
                    showMessage("Again: ");
                } else {
                    return option;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nPlease input a number\n");
            }
        }
    }




}
