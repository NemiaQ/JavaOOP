package HW03;

import HW03.figure.Figure;

import java.util.Comparator;

public class PerimeterComporator implements Comparator<Figure> {
    @Override
    public int compare(Figure o1, Figure o2) {
        return Double.compare(o1.area(), o2.area());
    }
}
