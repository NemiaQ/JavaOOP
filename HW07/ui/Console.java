package ui;

import presenter.Presenter;
import ui.menu.Menu;

import java.util.Scanner;

public class Console implements View {
    private Presenter presenter;
    private Menu menu;
    private Boolean statusFlag;
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    public void start() {
        menu = new Menu(this);
        statusFlag = true;
        while (statusFlag) {
            printMenu();
            menu.execute(getNum());
        }
    }

    private void printMenu() {
        print(menu.createMenu());
    }

    public int getNum() {
        System.out.print("Выберете пункт меню: ");
        return (scanner.nextInt()) - 1;
    }

    public void createNewNote() {
        print("Введите текст заметки:");
        String text = scanner.nextLine();
        text = scanner.nextLine();
        presenter.createNewNote(text);
        print("Заметка создана.");
    }

    public void allNotes() {
        print("Загрузка заметок.");
        print(presenter.allNotes());
    }

    public void exit() {
        statusFlag = false;
    }

    public void print(String text) {
        System.out.println(text);
    }

    public void editingNote() {
        print("Выберите заметку для редактирования.");
        print(presenter.allNotes());
        int num = scanner.nextInt() - 1;
        print("Введите новую заметку: ");
        String text = scanner.nextLine();
        text = scanner.nextLine();
        presenter.editingNote(num, text);
    }

    public void deleteNote() {
        print("Выберите заметку для удаления.");
        print(presenter.allNotes());
        int num = scanner.nextInt() - 1;
        presenter.deleteNote(num);
    }
}
