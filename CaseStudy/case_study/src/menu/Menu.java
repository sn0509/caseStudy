package menu;

import menu.itemList.MenuItem;

public interface Menu {
    void addMenuItem(MenuItem menuItem);
    void display();
    void runCommand(int choice);
}
