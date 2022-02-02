package io;

import shapes.MovablePoint;
import shapes.Square;
import java.awt.*;
import java.util.Scanner;

public class SquareFileHandler implements IReadShape<Square>{
    @Override
    public Square readShape(Scanner scanner) {
        var sideStr = scanner.nextLine();
        var rInRgbStr = scanner.nextLine();
        var gInRgbStr = scanner.nextLine();
        var bInRgbStr = scanner.nextLine();
        var filledStr = scanner.nextLine();
        var x1PositionStr = scanner.nextLine();
        var y1PositionStr = scanner.nextLine();
        var x2PositionStr = scanner.nextLine();
        var y2PositionStr = scanner.nextLine();

        // Process data
        var side = Double.parseDouble(sideStr);
        var rRgb = Integer.parseInt(rInRgbStr);
        var gRgb = Integer.parseInt(gInRgbStr);
        var bRgb = Integer.parseInt(bInRgbStr);
        var filled = Boolean.parseBoolean(filledStr.toLowerCase());
        var x1Position = Double.parseDouble(x1PositionStr);
        var y1Position = Double.parseDouble(y1PositionStr);
        var x2Position = Double.parseDouble(x2PositionStr);
        var y2Position = Double.parseDouble(y2PositionStr);

        return new Square(side,
                new Color(rRgb, gRgb, bRgb), filled,
                new MovablePoint(x1Position, y1Position),
                new MovablePoint(x2Position, y2Position));
    }
}
