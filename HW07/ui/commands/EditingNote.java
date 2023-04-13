package ui.commands;

import ui.Console;

public class EditingNote extends Command {
    public EditingNote(Console console) {
        super(console);
    }

    @Override
    public String getDescription() {
        return "Редактирование заметки.";
    }

    @Override
    public void execute() {
        getConsole().editingNote();
    }
}
