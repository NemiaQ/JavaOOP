package ui.commands;

import ui.Console;

public class AllNotes extends Command {
    public AllNotes(Console console) {
        super(console);
    }

    @Override
    public String getDescription() {
        return "Посмотреть все записи.";
    }

    @Override
    public void execute() {
        getConsole().allNotes();

    }
}
