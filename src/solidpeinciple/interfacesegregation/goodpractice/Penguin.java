package solidpeinciple.interfacesegregation.goodpractice;

public class Penguin implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Penguin is running");
    }
}
