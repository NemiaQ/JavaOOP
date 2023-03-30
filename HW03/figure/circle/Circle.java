package HW03.figure.circle;

import HW03.figure.Area;
import HW03.figure.Figure;

public class Circle extends Figure implements Circumference {

    private double radius;

    public Circle(double radius) throws Exception {
        this.radius = radius;
        if (radius < 1){
            throw new  Exception ("Круга с таким радиусом нет.");
        }
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double circumference() {
        return 2* Math.PI*radius;
    }
    @Override
    public String toString(){
        return String.format("Фигура %s, радиус %.2f", this.getClass().getSimpleName(), radius);
    }

}
