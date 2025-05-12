import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2));
        shapes.add(new Rectangle(1, 3));
        shapes.add(new Circle(1));

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + shape.getArea());
        }

        double totalArea = AreaCalculator.sumAreas(shapes);
        System.out.println("Total Area: " + totalArea);
    }
}

//Separare a responsabilităților: AreaCalculator se ocupă strict de logică, Main doar de orchestrare.
//
//Ușor de testat și extins (poți adăuga alte forme: Triangle, Polygon).
//
//Nu sunt necesari pointeri: totul se face prin OOP și referințe.