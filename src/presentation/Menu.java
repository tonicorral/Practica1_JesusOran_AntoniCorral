package presentation;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
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


}
