package solidpeinciple.interfacesegregation.badpractice;

public class Penguin implements Bird{
    @Override
    public void fly() {
        // Penguin can not fly
    }

    @Override
    public void swim() {
        System.out.println("Penguin is running");
    }

    @Override
    public void run() {
        // Penguin can not run
    }
}
