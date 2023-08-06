package solidpeinciple.interfacesegregation.badpractice;

public class Pigeon implements Bird {
    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }

    @Override
    public void swim() {
        // Pigeon can not swim
    }

    @Override
    public void run() {
        // Pigeon can not run
    }
}
