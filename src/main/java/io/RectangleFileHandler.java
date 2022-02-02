package io;

import shapes.MovablePoint;
import shapes.Rectangle;

import java.awt.*;
import java.util.Scanner;

public class RectangleFileHandler implements IReadShape<Rectangle> {

    @Override
    public Rectangle readShape(Scanner scanner) {
        var widthStr = scanner.nextLine();
        var lengthStr = scanner.nextLine();
        var rInRgbStr = scanner.nextLine();
        var gInRgbStr = scanner.nextLine();
        var bInRgbStr = scanner.nextLine();
        var filledStr = scanner.nextLine();
        var x1PositionStr = scanner.nextLine();
        var y1PositionStr = scanner.nextLine();
        var x2PositionStr = scanner.nextLine();
        var y2PositionStr = scanner.nextLine();

        // Process data
        var width = Double.parseDouble(widthStr);
        var length = Double.parseDouble(lengthStr);
        var rRgb = Integer.parseInt(rInRgbStr);
        var gRgb = Integer.parseInt(gInRgbStr);
        var bRgb = Integer.parseInt(bInRgbStr);
        var filled = Boolean.parseBoolean(filledStr.toLowerCase());
        var x1Position = Double.parseDouble(x1PositionStr);
        var y1Position = Double.parseDouble(y1PositionStr);
        var x2Position = Double.parseDouble(x2PositionStr);
        var y2Position = Double.parseDouble(y2PositionStr);

        return new Rectangle(width, length,
                new Color(rRgb, gRgb, bRgb), filled,
                new MovablePoint(x1Position, y1Position),
                new MovablePoint(x2Position, y2Position));
    }
}
