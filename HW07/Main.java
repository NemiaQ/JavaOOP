import model.Model;
import presenter.Presenter;
import ui.Console;
import ui.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new Console();
        new Presenter(view, model);

        view.start();
    }
}
