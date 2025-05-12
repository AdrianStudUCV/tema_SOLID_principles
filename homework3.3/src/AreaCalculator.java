import java.util.List;

public class AreaCalculator {
    public static double sumAreas(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }
}
