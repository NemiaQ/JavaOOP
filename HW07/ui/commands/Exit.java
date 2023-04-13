package ui.commands;

import ui.Console;

public class Exit extends Command {
    public Exit(Console console) {
        super(console);
    }

    @Override
    public String getDescription() {
        return "Выход из блокнота.";
    }

    @Override
    public void execute() {
        getConsole().exit();
    }
}
