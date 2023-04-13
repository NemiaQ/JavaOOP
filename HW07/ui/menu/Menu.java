package ui.menu;

import ui.Console;
import ui.commands.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> commands;
    private Console console;

    public Menu(Console console) {
        this.console = console;
        commands = new ArrayList<>();
        commands.add(new CreateNewNote(console));
        commands.add(new EditingNote(console));
        commands.add(new AllNotes(console));
        commands.add(new DeleteNote(console));
        commands.add(new Exit(console));
    }

    public void execute(int num) {
        Option option = commands.get(num);
        option.execute();
    }

    public String createMenu() {
        String menu = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        for (int i = 0; i < commands.size(); i++) {
            menu += (i + 1) + ". " + commands.get(i).getDescription() + "\n";
        }
        return menu;
    }
}
