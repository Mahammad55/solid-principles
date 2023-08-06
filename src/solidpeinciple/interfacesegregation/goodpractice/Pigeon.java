package solidpeinciple.interfacesegregation.goodpractice;

public class Pigeon implements Flyable{
    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }
}
