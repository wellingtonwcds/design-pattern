import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ShapeFactory {
    public Shape getShape(String shapeStr){
        Shape shape = null;
        if(shapeStr.equalsIgnoreCase("circle")){
            shape = new Circle();
        }else if(shapeStr.equalsIgnoreCase("square")){
            shape =  new Square();
        }else if(shapeStr.equalsIgnoreCase("rectangle")){
            shape =  new Rectangle();
        }
        return shape;
    }
}
