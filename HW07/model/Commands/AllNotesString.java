package model.Commands;

import java.util.List;

public class AllNotesString {
    public String allNotesString(List<String> notes) {
        String text = "";
        for (int i = 0; i < notes.size(); i++) {
            text += (i + 1) + ". " + notes.get(i) + "\n";
        }
        if (text.isEmpty()) {
            return "Блокнот пустой.";
        }
        return text;
    }
}
