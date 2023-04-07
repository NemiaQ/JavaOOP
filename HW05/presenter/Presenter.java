package HW05.presenter;

import HW05.model.Model;
import HW05.ui.View;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
        view.setPresenter(this);
    }

    public void getAnswer(String commandNumber) {
        String result = model.commandResult(commandNumber);
        if (result.equals("Заметка создана.")) {
            view.newNote();
        }
        view.print(result);
    }

    public void getMenu() {
        String menu = model.createMenu();
        view.print(menu);
    }

    public void createNote(String newNote) {
        model.createNewNote(newNote);
    }
}