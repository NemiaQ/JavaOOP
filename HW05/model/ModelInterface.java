package HW05.model;

public interface ModelInterface {
    String commandResult(String commandNumber);

    String createMenu();

    void createNewNote(String text);
}