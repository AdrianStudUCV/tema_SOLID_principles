import java.util.List;
import java.util.ArrayList;

// High-level module
class AreaCalculator {
    private List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void printAreas() {
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}
