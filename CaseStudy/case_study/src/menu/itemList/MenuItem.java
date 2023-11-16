package menu.itemList;

import menu.command.Command;

public class MenuItem {
    private String name;
    private Command command;

    public MenuItem(String name, Command command){
        this.name = name;
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
