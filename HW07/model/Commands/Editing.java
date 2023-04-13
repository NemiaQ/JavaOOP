package model.Commands;

import ui.commands.Note;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Editing {
    Note note;

    public void editing(List<String> notes, int num, String text) {
        Note note = new Note(text);
        this.note = note;
        String newNote = "Дата создания: " + note.getDate() + " || Текст заметки: " + note.getText();
        notes.set(num, newNote);
        try (FileWriter fw = new FileWriter("Notes.txt", false)) {
            for (String data : notes) {
                fw.write(data);
                fw.write("\n");
            }
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
