package solidpeinciple.openclosed.badpractice;

public class Shape {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public double getArea() {
        if (type.equalsIgnoreCase("circle")) {
            double radius = 1.0;
            return Math.PI * radius * radius;
        } else if (type.equalsIgnoreCase("rectangle")) {
            double width = 1.0;
            double height = 1.0;
            return width * height;
        } else {
            return 0.0;
        }
    }
}
