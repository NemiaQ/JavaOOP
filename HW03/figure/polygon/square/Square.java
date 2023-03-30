package HW03.figure.polygon.square;

import HW03.figure.polygon.rectangle.Rectangle;

public class Square extends Rectangle {

    public Square(double sideA) throws Exception{
        super(sideA, sideA);

    }
    @Override
    public String toString(){
        return String.format("Фигура %s, сторона %.2f", this.getClass().getSimpleName(), this.sides.get(0));
    }
}
