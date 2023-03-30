package HW03;

import HW03.figure.Area;
import HW03.figure.Figure;
import HW03.figure.circle.Circumference;
import HW03.figure.polygon.Perimeter;

import java.util.ArrayList;

public class Figures extends PerimeterComporator {
    private ArrayList<Figure> figures = new ArrayList<>();

    public void showAll(){
        for (Figure figure :
                figures) {
            System.out.println(figure);
        }
    }

    public void add(Figure figure) {
        this.figures.add(figure);
    }


    public void allPerimeter(){
        for (Figure figure : figures){
            if (figure instanceof Perimeter){
                System.out.printf("Периметр фигуры %s равен %.2f\n", figure.getClass().getSimpleName(), ((Perimeter)figure).perimeter());
            }
        }
    }

    public void allArea(){
        for (Figure figure : figures){
            if (figure instanceof Area){
                System.out.printf("Площадь фигуры %s равна %.2f\n", figure.getClass().getSimpleName(),((Area)figure).area());
            }
        }
    }
    public void allCircumference(){
        for (Figure figure : figures){
            if (figure instanceof Circumference){
                System.out.printf("Длина окружности фигуры %s равна %.2f\n", figure.getClass().getSimpleName(), ((Circumference)figure).circumference());
            }
        }
    }

    public void sortArea(){
        figures.sort(new PerimeterComporator());
    }

    public void remove(int i){
        this.figures.remove(i);
    }

    public void set(int i, Figure figure){
        this.figures.set(i, figure);
    }

}
