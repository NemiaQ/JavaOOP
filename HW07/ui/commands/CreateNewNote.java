package ui.commands;

import ui.Console;

public class CreateNewNote extends Command {
    public CreateNewNote(Console console) {
        super(console);
    }

    @Override
    public String getDescription() {
        return "Создать заметку.";
    }

    @Override
    public void execute() {
        getConsole().createNewNote();
    }
}
