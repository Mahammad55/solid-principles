package solidpeinciple.liskovsubstituation.goodpractice;

public class Program {
    public static void main(String[] args) {
        Area rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getArea());

        Area square=new Square(5);
        System.out.println(square.getArea());
    }
}
