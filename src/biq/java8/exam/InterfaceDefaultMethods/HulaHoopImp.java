package biq.java8.exam.InterfaceDefaultMethods;

public class HulaHoopImp implements Circle {
    private double radius;

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
