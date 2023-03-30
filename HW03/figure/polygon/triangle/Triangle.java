package HW03.figure.polygon.triangle;

import HW03.figure.polygon.Polygon;

public class Triangle extends Polygon {

    public Triangle(double sideA, double sideB, double sideC) throws Exception {
        super(sideA, sideB, sideC);
        this.sides.add(sideA);
        this.sides.add(sideB);
        this.sides.add(sideC);

        if ((sideA + sideB) < sideC || (sideA + sideC) < sideB || (sideB + sideC) < sideA) {
            throw new Exception ("Треугольника с такими сторонами нет.");
        }

    }

    @Override
    public double area() {
        double half = this.perimeter() / 2;
        return Math.sqrt(half * (half - this.sides.get(0))* (half - this.sides.get(1)) * (half - this.sides.get(2)));
    }

    @Override
    public double perimeter() {
        return this.sides.get(0) + this.sides.get(1) + this.sides.get(2);
    }
    @Override
    public String toString(){
        return String.format("Фигура %s, стороны %.2f, %.2f и %.2f", this.getClass().getSimpleName(), this.sides.get(0),this.sides.get(1),this.sides.get(2));
    }

}
