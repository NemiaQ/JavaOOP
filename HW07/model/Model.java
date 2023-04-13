package model;

import model.Commands.*;

import java.util.List;

public class Model implements ModelInterface {

    @Override
    public void createNewNotes(String text) {
        new AddNote(text);
    }

    @Override
    public String allNotes() {
        AllNotesList allList = new AllNotesList();
        List<String> list = allList.allNotesList();
        AllNotesString allString = new AllNotesString();
        String text = allString.allNotesString(list);
        return text;
    }

    @Override
    public void editing(int num, String text) {
        AllNotesList allList = new AllNotesList();
        Editing editing = new Editing();
        editing.editing(allList.allNotesList(), num, text);
    }

    @Override
    public void delete(int num) {
        AllNotesList allList = new AllNotesList();
        Delete delete = new Delete();
        delete.delete(allList.allNotesList(), num);
    }
}
