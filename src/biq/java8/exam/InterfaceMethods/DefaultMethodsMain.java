package biq.java8.exam.InterfaceMethods;

public class DefaultMethodsMain {
    public static void main(String[] args) {
        Circle myCircle = new SimpleCircle();
        myCircle.setRadius(10);
        
        System.out.println("Circle Area is: " + myCircle.area());
        
    }
}
