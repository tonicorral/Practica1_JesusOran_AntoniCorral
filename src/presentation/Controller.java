package presentation;

public class Controller {
    private Menu menu;

    public Controller(Menu menu){
        this.menu=menu;
    }

    public void run(){
        int option;

        menu.showWelcome();

        do{
            menu.showMenu();
            option = menu.askForOption();

            if(option > 5){
                menu.errorMessage();
            }
        }while (option != 5);

        menu.exitMessage();

    }
}

