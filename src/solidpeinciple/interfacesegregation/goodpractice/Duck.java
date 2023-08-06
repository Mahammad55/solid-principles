package solidpeinciple.interfacesegregation.goodpractice;

public class Duck implements Swimmable,Runnable{
    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
