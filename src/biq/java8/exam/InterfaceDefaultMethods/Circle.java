package biq.java8.exam.InterfaceDefaultMethods;

public interface Circle {

    //default method -> mean that area going to be implemented cant use "this"
    default public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
    //static method
    static double circumference(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    public double getRadius();

    public void setRadius(double radius);

}
