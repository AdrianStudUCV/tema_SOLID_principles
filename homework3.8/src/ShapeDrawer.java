import java.util.List;
import java.util.ArrayList;
// D – Dependency Inversion Principle
// High-level modules (like ShapeDrawer) depend on abstractions, not concrete classes

class ShapeDrawer {
    private final List<Shape> shapes;

    public ShapeDrawer(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void drawAll() {
        for (Shape shape : shapes) {
            shape.draw();  // L – Liskov Substitution Principle: all Shapes can be drawn
        }
    }
}