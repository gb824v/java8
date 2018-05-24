package biq.java8.exam.InterfaceDefaultMethods;

class SimpleCircleImp implements Circle {
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