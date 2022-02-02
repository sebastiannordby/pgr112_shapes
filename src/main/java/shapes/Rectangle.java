package shapes;

import java.awt.*;

public class Rectangle extends Shape {
    private double width;
    private double length;
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public Rectangle(double width, double length, Color color, boolean filled,
              MovablePoint topLeft, MovablePoint bottomRight) {

        super(color, filled);
        this.width = width;
        this.length = length;
        this.bottomRight = bottomRight;
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public MovablePoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " +
                length + ", topLeft: " + topLeft + ", bottomRight: " +
                bottomRight + " which is a subclass of " + super.toString();
    }

    @Override
    public void moveUp(double distance) {
        topLeft.moveUp(distance);
        bottomRight.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        topLeft.moveDown(distance);
        bottomRight.moveDown(distance);
    }

    @Override
    public void moveLeft(double distance) {
        topLeft.moveLeft(distance);
        bottomRight.moveLeft(distance);
    }

    @Override
    public void moveRight(double distance) {
        topLeft.moveRight(distance);
        bottomRight.moveRight(distance);
    }
}
