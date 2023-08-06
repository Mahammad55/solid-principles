package solidpeinciple.interfacesegregation.badpractice;

public class Duck implements Bird{
    @Override
    public void fly() {
        //  Duck can not fly
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }
}
