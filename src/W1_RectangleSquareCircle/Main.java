package W1_RectangleSquareCircle;

import java.util.Scanner;
//insert problem
public class Main {

    public static void main(String[] args) {
        //replace == with equals
        System.out.println("*Hi! This program can calculate area/perimeter of a rectangle/square/circle.*");
        System.out.println("*******See bellow result examples calculated with some default values.*******");

        Rectangle rectangle = new Rectangle(10, 20);
        Square square = new Square(10);
        Circle circle = new Circle(10);

        double rectangleArea = rectangle.calculateArea();
        double squareArea = square.calculateArea();
        double circleArea = circle.calculateArea();

        System.out.println("rectangle's area: " + rectangleArea);
        System.out.println("square's area: " + squareArea);
        System.out.println("circle's area: " + circleArea);

        double rectPerimeter = rectangle.calcPerimeter();
        double squarePerimeter = square.calcPerimeter();
        double circlePerimeter = circle.calcPerimeter();

        System.out.println("rectangle's perimeter: " + rectPerimeter);
        System.out.println("square's perimeter: " + squarePerimeter);
        System.out.println("circle's circumference: " + circlePerimeter);

        Scanner scanner = new Scanner(System.in);

        System.out.println(":D Ok! Now try it yourself! :D");
        System.out.println("Enter 1 for rectangle | 2 for square | 3 for circle: ");
        String shape = scanner.next();//check
        switch (shape) {
            case "1":
                System.out.println("Enter width:");
                rectangle.setWidth(scanner.nextDouble());//check
                System.out.println("Enter height:");
                rectangle.setHeight(scanner.nextDouble());//check
                System.out.println("Enter 1 for area or 2 for parameter:");
                String calc = scanner.next();
                if (calc.equals("1")) {
                    rectangleArea = rectangle.calculateArea();
                    System.out.println("rectangle's area: " + rectangleArea);
                } else if (calc.equals("2")) {
                    rectPerimeter = rectangle.calcPerimeter();
                    System.out.println("rectangle's perimeter: " + rectPerimeter);
                } else {
                    System.out.println("Not a valid input. Bye-bye!");
                }
                break;
            case "2":
                System.out.println("Enter side:");
                square.setSide(scanner.nextDouble());//check
                System.out.println("Enter 1 for area or 2 for perimeter:");
                calc = scanner.next();//check
                if (calc.equals("1")) {
                    squareArea = square.calculateArea();
                    System.out.println("square's area: " + squareArea);
                } else if (calc.equals("2")) {
                    squarePerimeter = square.calcPerimeter();
                    System.out.println("square's perimeter: " + squarePerimeter);
                } else {
                    System.out.println("Not a valid input. Bye-bye!");
                }
                break;
            case "3":
                System.out.println("Enter radius:");
                circle.setRadius(scanner.nextDouble());//check
                System.out.println("Enter 1 for area or 2 for circumference:");
                calc = scanner.next();//check
                if (calc.equals("1")) {
                    circleArea = circle.calculateArea();
                    System.out.println("circle's area: " + circleArea);
                } else if (calc.equals("2")) {
                    circlePerimeter = circle.calcPerimeter();
                    System.out.println("circle's circumference: " + circlePerimeter);
                } else {
                    System.out.println("Not a valid input. Bye-bye!");
                }
                break;
            default:
                System.out.println("Not a valid input. Bye!");
        }
    }
}
