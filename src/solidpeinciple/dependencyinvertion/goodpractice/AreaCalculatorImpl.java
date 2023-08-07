package solidpeinciple.dependencyinvertion.goodpractice;

public class AreaCalculatorImpl implements AreaCalculator{
    @Override
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
