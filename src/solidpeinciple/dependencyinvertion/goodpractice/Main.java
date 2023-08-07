package solidpeinciple.dependencyinvertion.goodpractice;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        AreaCalculator calculator = new AreaCalculatorImpl();

        double circleArea = calculator.calculateArea(circle);
        double rectangleArea = calculator.calculateArea(rectangle);

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
    }
}
