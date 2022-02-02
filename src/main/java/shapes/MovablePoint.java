package shapes;

public class MovablePoint implements IMovable {
    private double x, y;

    public MovablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void moveUp(double distance) {
        y += distance;
    }

    @Override
    public void moveDown(double distance) {
        y -= distance;
    }

    @Override
    public void moveLeft(double distance) {
        x -= distance;
    }

    @Override
    public void moveRight(double distance) {
        x += distance;
    }

    @Override
    public String toString(){
        return "x is " + this.x + ", y is " + this.y;
    }
}
