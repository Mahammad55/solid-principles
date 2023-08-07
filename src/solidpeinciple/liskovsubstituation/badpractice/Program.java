package solidpeinciple.liskovsubstituation.badpractice;

public class Program {
    static void getArea(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        System.out.println("Gozlenilen sahe: " + (width * 10) + " Hesablanan sahe: " + rectangle.area());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(2);
        rectangle.setWidth(3);
        getArea(rectangle);

        Rectangle square=new Square();
        square.setWidth(2);
        square.setHeight(3);
        square.setWidth(5);
        getArea(square);
    }
}
