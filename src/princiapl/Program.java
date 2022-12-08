package princiapl;

import entities.*;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("TOTAL DA AREA: " + totalArea(myCircles));
        

    }

    public static Double totalArea(List<? extends Shape> list) { // < Shape ou de qualuer tipo que seja um sub tipo de Shape > 
        Double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

}