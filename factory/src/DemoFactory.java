import shape.Shape;

public class DemoFactory {
    public static void main(String[] args) {
        // https://www.tutorialspoint.com/design_pattern/factory_pattern.htm
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("circle");
        circle.draw();

        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();

        Shape square = factory.getShape("square");
        square.draw();
    }
}