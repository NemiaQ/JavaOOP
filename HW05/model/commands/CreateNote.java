package HW05.model.commands;

public class CreateNote implements CommandsInterface {
    private final String NAME = "Создать заметку.";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String result() {
        return "Заметка создана.";
    }

    public void newNote(String text) {
        Note note = new Note(text);
        new AddNote(note);
    }
}