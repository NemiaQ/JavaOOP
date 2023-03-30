package HW03;


import HW03.figure.circle.Circle;
import HW03.figure.polygon.rectangle.Rectangle;
import HW03.figure.polygon.square.Square;
import HW03.figure.polygon.triangle.Triangle;

public class Program {
    public static void main(String[] args) throws Exception {
        Figures figures = new Figures();
        figures.add(new Rectangle(1, 2));
        figures.add(new Square(3));
        figures.add(new Triangle(4, 8, 7));
        figures.add(new Circle(1));

        System.out.println("До сортировки:");
        figures.showAll();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        figures.sortArea();
        System.out.println("После сортировки:");
        figures.showAll();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        figures.allPerimeter();
        figures.allArea();
        figures.allCircumference();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        figures.remove(1);
        System.out.println("Удалили вторую фигуру.");
        figures.showAll();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("Заменяем первую фигуру на окружность с радиусом 0.");
        figures.set(0, new Circle(0));
    }
}
