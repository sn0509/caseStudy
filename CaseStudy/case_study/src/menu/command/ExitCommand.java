package menu.command;

import menu.command.Command;

public class ExitCommand implements Command {
    private String exitTitle;
    public ExitCommand(String exitTitle){
        this.exitTitle=exitTitle;
    }
    @Override
    public void execute() {

    }
}
