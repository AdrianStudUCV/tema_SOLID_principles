import java.util.List;
import java.util.ArrayList;

// Main class to test the implementation
public class SolidShapeAreaDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3.0));
        shapes.add(new Square(4.0));
        shapes.add(new Rectangle(2.0, 5.0));

        AreaCalculator calculator = new AreaCalculator(shapes);
        calculator.printAreas();
    }
}