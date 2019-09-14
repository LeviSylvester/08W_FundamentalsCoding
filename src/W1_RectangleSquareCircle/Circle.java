package W1_RectangleSquareCircle;

public class Circle {
    private double radius;
//    static final double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calcPerimeter() {
        return Math.PI * 2 * radius;
    }
}
