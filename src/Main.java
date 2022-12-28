import business.CharacterManager;
import persistence.exceptions.PersistenceException;
import presentation.Controller;
import presentation.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        try{
            CharacterManager cm = new CharacterManager();
            Controller controller = new Controller(menu, cm);
            controller.run();
        } catch (Exception e){
            menu.showMessage(e.getMessage());
        }

    }
}