package solidpeinciple.liskovsubstituation.goodpractice;

public class Square implements Area {
    private double radius;

    public Square(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
