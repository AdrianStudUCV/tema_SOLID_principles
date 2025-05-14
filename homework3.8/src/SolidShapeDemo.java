import java.util.List;
import java.util.ArrayList;
// Main class to demonstrate
public class SolidShapeDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());

        ShapeDrawer drawer = new ShapeDrawer(shapes);
        drawer.drawAll();
    }
}