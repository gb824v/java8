package biq.java8.exam.InterfaceMethods;

public interface Circle {

    public double getRadius();

    public void setRadius(double radius);

    //default method
    default public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    //static method
    static double circumference(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }
}
