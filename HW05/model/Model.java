package HW05.model;

import HW05.model.commands.AllNotes;
import HW05.model.commands.CommandsInterface;
import HW05.model.commands.CreateNote;

import java.util.ArrayList;
import java.util.List;

public class Model implements ModelInterface {
    private List<CommandsInterface> commands = new ArrayList<>();

    CreateNote createNote = new CreateNote();

    public Model() {
        this.commands.add(createNote);
        this.commands.add(new AllNotes());
    }

    @Override
    public String commandResult(String commandNumber) {
        int commandIndex = Integer.parseInt(commandNumber) - 1;
        String result = commands.get(commandIndex).result();

        return result;
    }

    @Override
    public String createMenu() {
        String menu = "";
        for (int i = 0; i < commands.size(); i++) {
            menu += i + 1 + ". " + commands.get(i).getName() + "\n";
        }
        return menu;
    }

    @Override
    public void createNewNote(String text) {
        createNote.newNote(text);
    }

}
