package model.Commands;

import ui.commands.Note;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Delete {
    public void delete(List<String> notes, int num) {
        notes.remove(num);
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
