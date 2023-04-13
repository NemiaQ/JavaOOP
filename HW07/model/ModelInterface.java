package model;

public interface ModelInterface {
    void createNewNotes(String text);

    String allNotes();

    void editing(int num, String text);

    void delete(int num);


}
