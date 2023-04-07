package HW05.model.commands;

import java.io.FileWriter;
import java.io.IOException;

public class AddNote {
    Note note;

    public AddNote(Note note) {
        this.note = note;
        try (FileWriter fw = new FileWriter("Notes.txt", true)) {
            fw.write("Дата создания: " + note.getDate() + ". Текст заметки: " + note.getText());
            fw.append('\n');
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}