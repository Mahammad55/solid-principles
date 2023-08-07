package solidpeinciple.dependencyinvertion.badpractice;

public class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
