package model.Commands;

import ui.commands.Note;

import java.io.FileWriter;
import java.io.IOException;

public class AddNote {
    Note note;

    public AddNote(String text) {
        Note note = new Note(text);
        this.note = note;
        try (FileWriter fw = new FileWriter("Notes.txt", true)) {
            fw.write("Дата создания: " + note.getDate() + " ||Текст заметки: " + note.getText());
            fw.write("\n");
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }
    }

}
