package HW03.figure.polygon;

import HW03.figure.Figure;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon extends Figure implements Perimeter {
    protected List <Double> sides = new ArrayList<>();

    protected Polygon(double... sides) throws Exception{
        for(double side : sides){
            if(side <= 0){
                throw new Exception("Многоугольника с такими сторонами нет.");
            }
        }
    }

    public double perimeter(){
        double sum = 0;
        for(double side : this.sides){
            sum += side;
        }
        return sum;
    }

}
