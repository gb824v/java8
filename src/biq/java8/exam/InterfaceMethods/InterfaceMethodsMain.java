package biq.java8.exam.InterfaceMethods;

public class InterfaceMethodsMain {
    public static void main(String[] args) {
        Circle myCircle = new HulaHoop();
        myCircle.setRadius(1_000_000);
        
        System.out.println("Area = " + myCircle.area());
        System.out.println("Circumference = " + Circle.circumference(myCircle));
    }
}
