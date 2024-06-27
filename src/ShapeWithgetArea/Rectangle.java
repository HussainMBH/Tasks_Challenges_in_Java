package ShapeWithgetArea;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }
}
