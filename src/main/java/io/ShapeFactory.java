package io;

import shapes.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ShapeFactory {
    private final HashMap<String, IReadShape<?>> handlers;

    public ShapeFactory() {
        handlers = new HashMap<String, IReadShape<?>>();
        handlers.put("Circle", new CircleFileHandler());
        handlers.put("Rectangle", new RectangleFileHandler());
        handlers.put("Square", new SquareFileHandler());
    }

    public ArrayList<Shape> readShapesFromFile(File file) throws FileNotFoundException {
        var result = new ArrayList<Shape>();
        var scanner = new Scanner(file);

        while(scanner.hasNextLine()) {
            var shapeName = scanner.nextLine();
            var handler = handlers.get(shapeName);

            System.out.printf("Reading shape %s...\n", shapeName);
            Shape shape = handler.readShape(scanner);

            if(shape != null) { // Invalid data?
                result.add(shape);
            }
        }

        scanner.close();

        return result;
    }
}
