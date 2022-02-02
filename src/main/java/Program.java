import io.ShapeFactory;
import shapes.Shape;

import java.io.File;
import java.io.FileNotFoundException;

public class Program {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        try
        {
            var shapes = shapeFactory.readShapesFromFile(new File("C:\\IdeaProjects\\Shapes\\src\\shapes.txt"));

            for(Shape shape : shapes) {
                System.out.println(shape);
            }

        } catch(FileNotFoundException e) {
            System.err.println("Shapes file could not be found.");
        }
    }
}
