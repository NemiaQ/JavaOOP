package ui.commands;

import ui.Console;

public class DeleteNote extends Command {
    public DeleteNote(Console console) {
        super(console);
    }

    @Override
    public String getDescription() {
        return "Удаление заметки.";
    }

    @Override
    public void execute() {
        getConsole().deleteNote();
    }
}
