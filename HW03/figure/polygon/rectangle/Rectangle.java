package HW03.figure.polygon.rectangle;

import HW03.figure.polygon.Polygon;

public class Rectangle extends Polygon {

    public Rectangle(double sideA, double sideB) throws Exception {
        super(sideA, sideB);
        this.sides.add(sideA);
        this.sides.add(sideB);
    }

    @Override
    public double area() {
        return this.sides.get(0) * this.sides.get(1);
    }

    @Override
    public double perimeter() {
        return (this.sides.get(0) + this.sides.get(1))*2;
    }

    @Override
    public String toString(){
        return String.format("Фигура %s, стороны %.2f и %.2f", this.getClass().getSimpleName(), this.sides.get(0),this.sides.get(1));
    }
}
