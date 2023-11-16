package menu.itemList;

import menu.Menu;
import menu.Navigator;
import menu.command.ExitCommand;

import java.util.Scanner;

public class MenuMain implements Navigator {
    private final Scanner SCANNER = new Scanner(System.in);

    private void displayMenu(){
    Menu mainMenu = new MenuTemplate("Home page");
    mainMenu.addMenuItem(new MenuItem("Exit",new ExitCommand("Home page")));
    }
    @Override
    public void navigate() {

    }
}
