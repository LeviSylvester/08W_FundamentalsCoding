package W1_RectangleSquareCircle;

public class Square {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    Square(double side) {
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }

    double calcPerimeter() {
        return side * 4;
    }
}
