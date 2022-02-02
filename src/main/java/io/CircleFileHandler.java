package io;

import shapes.Circle;
import shapes.MovablePoint;
import java.awt.*;
import java.util.Scanner;

public class CircleFileHandler implements IReadShape<Circle> {

    @Override
    public Circle readShape(Scanner scanner) {
        var radiusStr = scanner.nextLine();
        var rInRgbStr = scanner.nextLine();
        var gInRgbStr = scanner.nextLine();
        var bInRgbStr = scanner.nextLine();
        var filledStr = scanner.nextLine();
        var xPositionStr = scanner.nextLine();
        var yPositionStr = scanner.nextLine();

        // Process data
        var radius = Integer.parseInt(radiusStr);
        var rRgb = Integer.parseInt(rInRgbStr);
        var gRgb = Integer.parseInt(gInRgbStr);
        var bRgb = Integer.parseInt(bInRgbStr);
        var filled = Boolean.parseBoolean(filledStr.toLowerCase());
        var xPosition = readParsePosition(xPositionStr);
        var yPosition = readParsePosition(yPositionStr);

        return new Circle(radius, new Color(rRgb, gRgb, bRgb), filled, new MovablePoint(xPosition, yPosition));
    }

    private double readParsePosition(String position) {
        return Double.parseDouble(position.replace("-", "").replace(" ", ""));
    }
}
