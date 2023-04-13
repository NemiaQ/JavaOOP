package presenter;

import model.Model;
import ui.View;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setPresenter(this);
    }

    public void createNewNote(String text) {
        model.createNewNotes(text);
    }

    public String allNotes() {
        return model.allNotes();
    }

    public void editingNote(int num, String text) {
        model.editing(num, text);
    }

    public void deleteNote(int num) {
        model.delete(num);
    }

}
