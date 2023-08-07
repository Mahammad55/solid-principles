package solidpeinciple.liskovsubstituation.badpractice;

public class Square extends Rectangle{
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Setting both sides equal to maintain square properties
    }

    @Override
    public void setHeight(int height) {
        this.width = height; // Setting both sides equal to maintain square properties
        this.height = height;
    }
}
