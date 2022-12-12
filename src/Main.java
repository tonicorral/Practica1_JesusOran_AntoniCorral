import persistence.exceptions.PersistenceException;
import presentation.Controller;
import presentation.Menu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        try{
            Controller controller = new Controller(menu);
            controller.run();
        } catch (Exception e){
            menu.showMessage(e.getMessage());
        }

    }
}