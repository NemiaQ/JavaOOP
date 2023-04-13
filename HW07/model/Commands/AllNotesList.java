package model.Commands;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AllNotesList {
    public List allNotesList() {
        List<String> notes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Notes.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                notes.add(str);
            }
            br.close();
        } catch (IOException ex) {
            notes.add(ex.getMessage());
        }
        if (notes.isEmpty()) {
            notes.add("Блокнот пустой.");
        }
        return notes;
    }
}
