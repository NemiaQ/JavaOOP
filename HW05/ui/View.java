package HW05.ui;

import HW05.presenter.Presenter;

public interface View {
    void start();

    void setPresenter(Presenter presenter);

    void print(String text);

    void newNote();
}