package HW05.ui;

import HW05.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        presenter.getMenu();
        String commandNumber = scan("Выберете команду: ");
        presenter.getAnswer(commandNumber);
    }

    private String scan(String text) {
        System.out.println(text);
        return scanner.nextLine();
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void newNote() {
        String note = scan("Введите текст заметки: ");
        presenter.createNote(note);
    }
}

